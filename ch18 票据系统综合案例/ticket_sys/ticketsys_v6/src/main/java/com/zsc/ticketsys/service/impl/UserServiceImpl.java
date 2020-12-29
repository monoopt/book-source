package com.zsc.ticketsys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsc.ticketsys.domain.PageDomain;
import com.zsc.ticketsys.entity.Role;
import com.zsc.ticketsys.entity.User;
import com.zsc.ticketsys.entity.UserRole;
import com.zsc.ticketsys.exception.UserNotFoundException;
import com.zsc.ticketsys.mapper.RoleMapper;
import com.zsc.ticketsys.mapper.UserMapper;
import com.zsc.ticketsys.mapper.UserRoleMapper;
import com.zsc.ticketsys.service.UserRoleService;
import com.zsc.ticketsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    UserRoleService userRoleService;

    @Autowired
    UserRoleMapper userRoleMapper;



    // 获取用户的详细信息，包括角色
    @Override
    @Cacheable(value = "user", key = "#userId")
    public User getDetailsById(Long userId) {
        // 查询用户的基本信息
        User user = this.getById(userId);
        if (user == null)
            throw new UserNotFoundException();
        //查询用户的角色关联
        List<Role> roles = roleMapper.listRolesByUserId(userId);
        user.setRoles(roles);
        return user;
    }

    //根据用户名获取用户详细信息
    @Override
//    @Cacheable(value = "user", key = "#username")
    public User getDetailsByUsername(String username) {
        // 根据用户名查询用户对象,使用QueryWrapper查询
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User user = baseMapper.selectOne(queryWrapper);
        System.out.println(user);
        if (user == null)
            throw new UserNotFoundException();
        //查询该用户对应的权限列表
        List<Role> roles = roleMapper.listRolesByUserId(user.getId());
        user.setRoles(roles);
        return user;
    }

    //添加用户
    @Override
    @CachePut(value = "user", key = "#user.id")
    public void insertUser(User user) {
        //1.将用户的基本信息插入到用户表user
    
        //2.将用户对应的角色信息插入到表user_role
  
    }

    //更新用户操作
    @Override
    @CachePut(value = "user", key = "#result.id")
    public User updateUser(User userDto) {
        // 1.更新用户的基本信息
        User user = baseMapper.selectById(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setEnable(userDto.getEnable());
        user.setUpdateTime(new Date());
        baseMapper.updateById(user);
        // 2.删除原来的用户对应的角色关系
        userRoleMapper.deleteRolesByUserId(userDto.getId());
        // 3.插入新的关联
        List<UserRole> userRoleList = getUserRoleList(userDto);
        userRoleService.saveBatch(userRoleList);
        //返回值存入redis缓存
        return this.getDetailsById(user.getId());
    }

    @Override
    @CacheEvict(value = "user", key = "#id")
    public boolean deleteUser(long id) {
        //1.删除用户基本信息
        if (baseMapper.deleteById(id) == 0)
            return false;
        //2.在关联表中删除用户对应的角色关联
        userRoleMapper.deleteRolesByUserId(id);
        return true;
    }

    @Override
    public PageInfo<User> listUser(PageDomain pageDomain, User user) {
      
    
    }

    @Override
    public void updateStatusByIds(Long[] ids, int status) {
     
    }

    @Override
    public void deleteBatch(Long[] ids) {
        //1.将数组转换为ArrayList类型，调用mybatis-plus的批量删除接口
        baseMapper.deleteBatchIds(Arrays.asList(ids));
        //2.在关联表中删除用户对应的角色关联
        for (int i = 0; i < ids.length; ++i)
            userRoleMapper.deleteRolesByUserId(ids[i]);
    }

    @Override
    public void resetPassword(Long[] ids) {
        //重置密码,和用户名相同
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < ids.length; ++i) {
            User user = new User();
            user.setId(ids[i]);
            //获取用户名
            String username = this.getById(ids[i]).getUsername();
            //设置新密码
            user.setPassword(new BCryptPasswordEncoder().encode(username));
            userList.add(user);
        }
        //批量更新
        this.updateBatchById(userList);
    }

    //获取该用户对应的用户-角色关联列表
    public List<UserRole> getUserRoleList(User user) {
        List<UserRole> userRoleList = new ArrayList<>();
        for (Role role : user.getRoles()) {
            UserRole userRole = new UserRole();
            userRole.setUserId(user.getId());
            userRole.setRoleId(role.getId());
            userRoleList.add(userRole);
        }
        return userRoleList;
    }
}
