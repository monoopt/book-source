package com.javaee.ticketsys.controller.admin;


import com.github.pagehelper.PageInfo;
import com.javaee.ticketsys.controller.BaseController;
import com.javaee.ticketsys.model.Role;
import com.javaee.ticketsys.model.User;
import com.javaee.ticketsys.model.bean.PageBean;
import com.javaee.ticketsys.model.bean.ResponseBean;
import com.javaee.ticketsys.model.constants.Constants;
import com.javaee.ticketsys.model.dto.UserDto;
import com.javaee.ticketsys.service.RoleService;
import com.javaee.ticketsys.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


/*
  功能说明：管理员用户操作类
  @author：hevean
  @date:2019-12-1
 */
@Api("角色接口")
@RestController

public class RoleController extends BaseController {

    @Autowired
    RoleService roleService;

    @GetMapping("roles")
    public ResponseBean list() {
        return ResponseBean.success(roleService.list());
    }


}

