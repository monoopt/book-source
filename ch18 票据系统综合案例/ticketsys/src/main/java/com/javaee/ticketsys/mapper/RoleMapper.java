package com.javaee.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javaee.ticketsys.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询用户对应的所有权限
    */

    @Select("select r.*  from user u, user_role ur,role r where u.id=ur.user_id and ur.role_id=r.id and u.id=#{id}")
    public List<Role> listRolesByUserId(Long id);




}
