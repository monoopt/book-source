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
@Api("用户管理接口")
@RestController
@RequestMapping("admin/user")
public class UserController extends BaseController {
    String prefix = "backend/user";
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    /**
     * 分页显示查询用户
     */
    @GetMapping("list")
    public ResponseBean list(
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortColumn,
            @RequestParam(defaultValue = "asc") String sortOrder,
            UserDto userDto     //查询数据
    ) {
        log.info("分页请求" + pageNum + ";" + pageSize + sortColumn);
        PageBean pageBean = new PageBean(pageNum, pageSize, sortColumn, sortOrder);
        PageInfo<User> pageInfo = userService.query(userDto, pageBean);
        return ResponseBean.success(pageInfo);
    }


    /* 添加用户*/
    @PostMapping
    public ResponseBean add(@RequestBody User user) {
        log.info("插入用户信息:" + user.toString());
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode("123"));
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setRegisterIp(request.getRemoteAddr());
        user.setEnable(Constants.USER_ENABLE);
        userService.add(user);
        return ResponseBean.success();
    }

    /*返回个人信息界面*/
    @GetMapping("{id}")
    public ModelAndView getById(@PathVariable("id") long id) {
        log.info("读取用户信息,id=" + id);
        User user = userService.getDetailsById(id);
        return new ModelAndView(prefix + "/view", "user", user);
    }

    /*返回用户编辑界面*/
    @GetMapping("edit/{id}")
    public ModelAndView edit(@PathVariable("id") long id, Model model) {
        log.info("读取用户信息,id=" + id);
        User user = userService.getDetailsById(id);
        List<Role> roleList = roleService.list();

        //将用户的角色id转换为一个List，并存入model
        List<Long> userRoles = user.getRoles().stream()
                .map(r -> r.getId()).collect(Collectors.toList());
        model.addAttribute("userRoles", userRoles);
        model.addAttribute("user", user);
        model.addAttribute("roleList", roleList);
        return new ModelAndView(prefix + "/edit", "model", model);
    }

    /*更新用户信息*/
    @PutMapping
    public ResponseBean update(@RequestBody User user) {
        userService.update(user);
        return ResponseBean.success();
    }

    /*批量删除用户*/
    @DeleteMapping
    public ResponseBean deleteBatch(@RequestBody Long[] ids) {
        userService.deleteBatch(ids);
        return ResponseBean.success();
    }

    /*删除用户*/
    @DeleteMapping("{id}")
    public ResponseBean delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseBean.success();
    }

    /*修改用户状态用户，status=0，停用；status=1，激活*/
    @PostMapping("changeStatus/{status}")
    public ResponseBean changeStatus(@RequestBody Long[] ids, @PathVariable int status) {
        userService.changeStatus(ids, status);
        return ResponseBean.success();
    }
}

