package com.javaee.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javaee.ticketsys.model.UserRole;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
       // 删除用户对应的所有权限关联
       @Delete("delete  from user_role  where user_id=#{userId}")
       public int deleteRolesByUserId(Long userId);

       //批量删除用户关联
       public int deleteBatchUserRole(Long userIds[]);
}
