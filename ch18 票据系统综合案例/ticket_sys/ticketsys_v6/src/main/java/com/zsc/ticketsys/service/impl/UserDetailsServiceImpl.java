package com.zsc.ticketsys.service.impl;

import com.zsc.ticketsys.entity.Role;
import com.zsc.ticketsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用于spring security用户身份验证
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //获取用户对象
        com.zsc.ticketsys.entity.User user = userService.getDetailsByUsername(username);
        if (user != null) {
            List<Role> authorities = user.getRoles();
            //对用户权限进行转换
            List<SimpleGrantedAuthority> list = authorities.stream()
                    .map(authority -> new SimpleGrantedAuthority(authority.getRoleName()))
                    .collect(Collectors.toList());

//            构造userDetails对象
            boolean enable = user.getEnable() == 1 ? true : false;
            UserDetails userDetails = new User(user.getUsername(), user.getPassword(),
                    enable, true, true, true, list);
            return userDetails;
        } else {
            System.out.println("用户名不存在");
            throw new UsernameNotFoundException("当前用户不存在");
        }
    }
}
