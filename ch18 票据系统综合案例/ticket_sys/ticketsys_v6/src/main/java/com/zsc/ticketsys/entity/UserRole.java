package com.zsc.ticketsys.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class UserRole {
    @TableId(type= IdType.AUTO)  //自增主键
    Long id;
    Long userId;
    Long roleId;
}
