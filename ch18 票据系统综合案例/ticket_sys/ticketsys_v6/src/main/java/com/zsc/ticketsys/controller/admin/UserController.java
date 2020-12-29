package com.zsc.ticketsys.controller.admin;


import com.github.pagehelper.PageInfo;
import com.zsc.ticketsys.bean.ResponseBean;
import com.zsc.ticketsys.constants.Constants;
import com.zsc.ticketsys.controller.BaseController;
import com.zsc.ticketsys.domain.PageDomain;
import com.zsc.ticketsys.entity.Role;
import com.zsc.ticketsys.entity.User;
import com.zsc.ticketsys.exception.OpsNoExistException;
import com.zsc.ticketsys.exception.UserDeleteException;
import com.zsc.ticketsys.exception.UserNotFoundException;
import com.zsc.ticketsys.service.RoleService;
import com.zsc.ticketsys.service.UserService;
import com.zsc.ticketsys.utils.StringFormmat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/*
  功能说明：管理员用户操作类
  @author：hevean
  @date:2019-12-1
 */
@RestController
@RequestMapping("/admin/user")
@Slf4j
public class UserController extends BaseController {
    String prefix = "admin/user";
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @Value("${user.default_password}")
    String defaultPassword;

    //分页显示查询用户
    @GetMapping("/list")
    public ResponseBean listUser(
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortColumn,
            @RequestParam(defaultValue = "asc") String sortOrder,
            User user
    ) {
        log.info("分页请求" + pageNum + ";" + pageSize + sortColumn);
        //将前端的字段字符串转换为下划线格式，并构造分页对象
      
    }


    // 添加用户,接收前端传过来的用户数据
    @PostMapping("")
    public ResponseBean insert(@Valid User user) {
    
    }

    //使用GET方法获取用户对象
    @GetMapping("/{id}")
    public ModelAndView view(@PathVariable("id") long id) {
        log.info("读取用户信息,id=" + id);
        User user = userService.getDetailsById(id);
        if (user == null) {
            throw new UserNotFoundException();
        }
        return new ModelAndView(prefix + "/view", "user", user);
    }

    //使用GET方法获取用户对象
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") long id, Model model) {
        log.info("读取用户信息,id=" + id);
        User user = userService.getDetailsById(id);
        if (user == null) {
            throw new UserNotFoundException();
        }
        List<Role> roleList = roleService.list();
        model.addAttribute("user", user);
        model.addAttribute("roleList", roleList);
        return new ModelAndView(prefix + "/edit", "model", model);
    }

    //删除用户
    @DeleteMapping("/{id}")
    public ResponseBean delete(@PathVariable("id") long id) {
        if (!userService.deleteUser(id))
            throw new UserDeleteException();
        return ResponseBean.success();

    }

    //删除多个用户

    //更新用户
    @PutMapping("")
    public ResponseBean update(User user) {
        System.out.println(user);
        userService.updateUser(user);
        return ResponseBean.success();
    }


    /**
     * 根据客户端提交的用户id进行批量操作
     *
     * @param type 操作类型
     * @param ids  用户id
     * @return
     */
    @PostMapping("/batchOps/{type}")
    public ResponseBean batchOps(@PathVariable String type, Long[] ids) {
        
        }
        return ResponseBean.success();
    }

 
}

