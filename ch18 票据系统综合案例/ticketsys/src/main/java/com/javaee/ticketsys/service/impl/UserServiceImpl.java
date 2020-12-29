package com.javaee.ticketsys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javaee.ticketsys.model.Role;
import com.javaee.ticketsys.model.User;
import com.javaee.ticketsys.model.UserRole;
import com.javaee.ticketsys.model.bean.PageBean;
import com.javaee.ticketsys.model.dto.UserQueryBean;
import com.javaee.ticketsys.mapper.UserMapper;
import com.javaee.ticketsys.mapper.UserRoleMapper;
import com.javaee.ticketsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public User getDetailsById(Long userId) {
        return null;
    }

    /**
     * 获取用户详细信息
     * @param username
     * @return
     */
    @Override
    public User getDetailsByUsername(String username) {
        return baseMapper.getDetailsByUsername(username);
    }

    /**
     * 添加用户信息，包括用户权限信息
     * @param user
     */
    @Override
    public void add(User user) {
        //插入信息到用户表
        baseMapper.insert(user);
        //将用户对应的角色插入user_role关联表
        for (Role role:user.getRoles()) {
            UserRole userRole = new UserRole(user.getId(), role.getId());
            userRoleMapper.insert(userRole);
        }
    }

    @Override
    public User update(User user) {
        return null;
    }

    /**
     * 删除用户的数据以及用户对应的权限数据
     * @param id
     */
    @Override
    public void delete(long id) {
        baseMapper.deleteById(id);
        userRoleMapper.deleteRolesByUserId(id);
    }

    /**
     * 自定义用户查询并对查询结果进行分页
     * @param pageBean
     * @param userQueryBean
     * @return
     */
    @Override
    public PageInfo<User> queryUsers(PageBean  pageBean, UserQueryBean userQueryBean) {
        //设置分页查询的参数
        PageHelper.startPage(pageBean.getPageNum(), pageBean.getPageSize(), pageBean.buildOrderStr());
        //查询用户数据
        List<User> list = baseMapper.queryUsers(userQueryBean);
        //返回分页对象
        return new PageInfo<>(list);
    }

    @Override
    public void updateStatusByIds(Long[] ids, int status) {

    }

    @Override
    public void deleteBatch(Long[] ids) {

    }
}
