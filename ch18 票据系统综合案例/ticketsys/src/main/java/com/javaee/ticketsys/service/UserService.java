package com.javaee.ticketsys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.javaee.ticketsys.model.User;
import com.javaee.ticketsys.model.bean.PageBean;
import com.javaee.ticketsys.model.dto.UserQueryBean;

public interface UserService extends IService<User> {
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
    public void add(User user);

    /**
     * 更新用户信息
     * @return
     */
    public User update(User user);

    /**
     * 根据id删除用户记录，以及相应的权限记录
     * @param id
     */
    public void delete(long id);

    /**
     * 根据用户信息分页查询用户列表
     *
     * @return
     */
    public PageInfo<User> queryUsers(PageBean pageBean, UserQueryBean queryBean);

    public void updateStatusByIds(Long[] ids, int status);

    public void deleteBatch(Long[] ids);


}
