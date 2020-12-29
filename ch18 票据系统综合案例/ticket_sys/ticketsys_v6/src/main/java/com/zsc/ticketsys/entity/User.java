package com.zsc.ticketsys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.zsc.ticketsys.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

//@Table(name = "user")
//@Builder
@Data

@Builder   //开启对象的builder模式
@AllArgsConstructor    //添加全参构造器
@NoArgsConstructor      //添加无参构造器
public class User{
    @TableId(type= IdType.AUTO)
    Long id;             //id
    @NotNull(message = "用户名不能为空")
    String username;   //用户名
    @Length(min = 4, message =  "密码长度至少为4个字符")
    String password;   //密码
    String email;      //电子邮件
    Date createTime;  //注册时间
    Date updateTime;  //更新时间
    String registerIp;  //注册ip
    Integer enable;         //表示用户状态、status=0表示用户停用，status=1表示用户激活

    @TableField(exist = false)
    List<Role> roles;

}

