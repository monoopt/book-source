package com.zsc.ticketsys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.zsc.ticketsys.domain.PageDomain;
import com.zsc.ticketsys.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

//    /**
//     *  获取用户的详细信息，包括用户权限列表,使用连表查询方式获取
//     * @param userId
//     * @return
//     */
//    public User getUserWithRole(Long userId);

    /**
     *  获取用户的详细信息，包括用户权限列表,使用多个单表查询方式获取
     * @param userId
     * @return
     */
    public User getDetailsById(Long userId);


    public User getDetailsByUsername(String username);

    /**
     * 添加用户
     * @param user
     */
    public void insertUser(User user);

    /**
     * 更新用户信息
     * @param userDto
     * @return
     */
    public User updateUser(User userDto);

    /**
     * 根据id删除用户记录，以及相应的权限记录
     * @param id
     * @return
     */
    public boolean deleteUser(long id);

    /**
     * 根据用户信息分页查询用户列表
     *
     * @param pageDomain
     * @param user
     * @return
     */
    public PageInfo<User> listUser(PageDomain pageDomain, User user);

    public void updateStatusByIds(Long[] ids, int status);

    public void deleteBatch(Long[] ids);

    /**
     *
     * @param ids
     */
    public void resetPassword(Long[] ids);
}
