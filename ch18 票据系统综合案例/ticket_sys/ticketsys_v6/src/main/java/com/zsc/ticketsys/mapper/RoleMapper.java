package com.zsc.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsc.ticketsys.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询所有的权限
     * @Param id 用户id
     * return 查找到用户，返回包含用户对象的list，查不到，返回长度为0的list
      */

    @Select("select r.*  from user u, user_role ur,role r where u.id=ur.user_id and ur.role_id=r.id and u.id=#{id}")
    public List<Role> listRolesByUserId(Long id);



}
