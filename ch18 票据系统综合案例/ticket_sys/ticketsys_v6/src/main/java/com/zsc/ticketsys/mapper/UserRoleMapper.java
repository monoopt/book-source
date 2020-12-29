package com.zsc.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsc.ticketsys.entity.User;
import com.zsc.ticketsys.entity.UserRole;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
    // 删除用户对应的所有权限关联
    @Delete("delete  from user_role  where user_id=#{userId}")
    public int deleteRolesByUserId(Long userId);
}
