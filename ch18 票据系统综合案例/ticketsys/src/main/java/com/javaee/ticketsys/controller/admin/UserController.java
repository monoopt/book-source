package com.javaee.ticketsys.controller.admin;


import com.github.pagehelper.PageInfo;
import com.javaee.ticketsys.model.User;
import com.javaee.ticketsys.model.bean.PageBean;
import com.javaee.ticketsys.model.bean.ResponseBean;
import com.javaee.ticketsys.model.constants.Constants;
import com.javaee.ticketsys.model.dto.UserQueryBean;
import com.javaee.ticketsys.service.RoleService;
import com.javaee.ticketsys.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/*
  功能说明：管理员用户操作类
  @author：hevean
  @date:2019-12-1
 */
@RestController
@RequestMapping("admin/user")
@Slf4j
public class UserController extends BaseController {
    String prefix = "admin/user";
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    //分页显示查询用户
    @GetMapping("list")
    public ResponseBean listUser(
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortColumn,
            @RequestParam(defaultValue = "asc") String sortOrder,
            UserQueryBean queryBean
    ) {
        log.info("分页请求" + pageNum + ";" + pageSize + sortColumn);
        PageBean pageBean = new PageBean(pageNum, pageSize,sortColumn,sortOrder);
        PageInfo<User> pageInfo = userService.queryUsers(pageBean, queryBean);
        return  ResponseBean.success(pageInfo);
    }

//
    // 添加用户,接收前端传过来的用户数据
    @PostMapping("add")
    public ResponseBean add(User user) {
        log.info("插入用户信息:"+user.toString());
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//        user.setPassword(encoder.encode("123"));
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setRegisterIp(request.getRemoteAddr());
        user.setEnable(Constants.USER_ENABLE);
        userService.add(user);
        return  ResponseBean.success();
    }

//    //使用GET方法获取用户对象
//    @GetMapping("/{id}")
//    public ModelAndView view(@PathVariable("id") long id) {
//        log.info("读取用户信息,id=" + id);
//        User user = userService.getDetailsById(id);
//        if (user == null) {
//            throw new UserNotFoundException();
//        }
//        return new ModelAndView(prefix + "/view", "user", user);
//    }
//
//    //使用GET方法获取用户对象
//    @GetMapping("/edit/{id}")
//    public ModelAndView edit(@PathVariable("id") long id, Model model) {
//        log.info("读取用户信息,id=" + id);
//        User user = userService.getDetailsById(id);
//        if (user == null) {
//            throw new UserNotFoundException();
//        }
//        List<Role> roleList = roleService.list();
//        model.addAttribute("user", user);
//        model.addAttribute("roleList", roleList);
//        return new ModelAndView(prefix + "/edit", "model", model);
//    }
//
//    //删除用户
//    @DeleteMapping("/{id}")
//    public ResponseBean delete(@PathVariable("id") long id) {
//        if (!userService.deleteUser(id))
//            throw new UserDeleteException();
//        return ResponseBean.success();
//
//    }
//
//    //删除多个用户
//
//    //更新用户
//    @PutMapping("")
//    public ResponseBean update(User user) {
//        System.out.println(user);
//        userService.updateUser(user);
//        return ResponseBean.success();
//    }
//
//
//    /**
//     * 根据客户端提交的用户id进行批量操作
//     *
//     * @param type 操作类型
//     * @param ids  用户id
//     * @return
//     */
//    @PostMapping("/batchOps/{type}")
//    public ResponseBean batchOps(@PathVariable String type, Long[] ids) {
//
//        }
//        return ResponseBean.success();
//    }


}

