package com.javaee.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javaee.ticketsys.model.User;
import com.javaee.ticketsys.model.dto.UserQueryBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    public  List<User> queryUsers(UserQueryBean userQueryBean);

    public User getDetailsById(Long id);
    public User getDetailsByUsername(String id);

//    //  用户对角色的多对对的关联查询
//    @ResultMap("User_Role")
//    @Select("select *  from user u, user_role ur,role r where u.id=ur.user_id and ur.role_id=r.id and u.id=#{userId}")
//    public User getUserWithRole(@Param("userId") Long userId);
//
//    /**
//     * 根据条件分页查询用户列表
//     *
//     * @param user 用户信息
//     * @return 用户信息集合信息
//     */
//    public  List<User> listUser(User user);

}
