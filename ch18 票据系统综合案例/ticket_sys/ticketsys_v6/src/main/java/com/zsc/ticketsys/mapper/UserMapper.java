package com.zsc.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsc.ticketsys.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    //  用户对角色的多对对的关联查询
    @ResultMap("User_Role")
    @Select("select *  from user u, user_role ur,role r where u.id=ur.user_id and ur.role_id=r.id and u.id=#{userId}")
    public User getUserWithRole(@Param("userId") Long userId);

    /**
     * 根据条件分页查询用户列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    public  List<User> listUser(User user);

}
