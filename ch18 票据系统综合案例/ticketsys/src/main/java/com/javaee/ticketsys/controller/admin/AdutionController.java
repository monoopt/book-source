//package com.javaee.ticketsys.controller.admin;
//
//import com.github.pagehelper.PageInfo;
//import com.javaee.ticketsys.controller.BaseController;
//import com.javaee.ticketsys.model.Audit;
//import com.javaee.ticketsys.model.bean.ResponseBean;
//import com.javaee.ticketsys.service.AuditService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * 审核票据控制器
// */
//@RestController
//@RequestMapping("admin/audit")
////@Slf4j
//public class AdutionController extends BaseController {
//    static String prefix="/audition/";
//
//    @Autowired
//    AuditService auditService;
////
////    /**分页显示查询*/
////    @GetMapping("list")
////    public ResponseBean list(
////            @RequestParam(defaultValue = "1") int pageNum,
////            @RequestParam(defaultValue = "10") int pageSize,
////            @RequestParam(defaultValue = "id") String sortColumn,
////            @RequestParam(defaultValue = "asc") String sortOrder,
////            AuditQueryBean queryBean     //查询数据
////    ) {
////
////        log.info("分页请求" + pageNum + ";" + pageSize + sortColumn);
////        PageBean pageBean = new PageBean(pageNum, pageSize,sortColumn,sortOrder);
////        PageInfo<Audit> pageInfo = AuditService.query(queryBean, pageBean);
////        return  ResponseBean.success(pageInfo);
////    }
//
//    /*审核票据*/
//    @PostMapping
//    public ResponseBean add(@RequestBody Audit audit) {
//        log.info("添加审核信息:"+ audit.toString());
//        return  ResponseBean.success();
//    }
//
//    /*获取审核结果*/
//    @GetMapping("{id}")
//    public ModelAndView view(@PathVariable("id") long ticketId) {
////        log.info("读取用户信息,id=" + id);
//        Audit Audit = auditService.getByTicketId(ticketId);
//        return new ModelAndView(prefix + "/view", "Audit", Audit);
//    }
//////
////    //使用GET方法获取用户对象
////    @GetMapping("/edit/{id}")
////    public ModelAndView edit(@PathVariable("id") long id, Model model) {
////        log.info("读取用户信息,id=" + id);
////        User user = userService.getDetailsById(id);
////        if (user == null) {
////            throw new UserNotFoundException();
////        }
////        List<Role> roleList = roleService.list();
////        model.addAttribute("user", user);
////        model.addAttribute("roleList", roleList);
////        return new ModelAndView(prefix + "/edit", "model", model);
////    }
////
////    //删除
////    @DeleteMapping
////    public ResponseBean delete(@RequestBody Long ids[]) {
////       auditService.delete(ids);
////        return ResponseBean.success();
////    }
////
////    //删除多个用户
////
//////    //更新
////    @PutMapping
////    public ResponseBean update(@RequestBody Audit Audit) {
////        log.info(Audit.toString());
////        AuditService.update(Audit);
////        return ResponseBean.success();
////    }
//////
////
////    /**
////     * 根据客户端提交的用户id进行批量操作
////     *
////     * @param type 操作类型
////     * @param ids  用户id
////     * @return
////     */
////    @PostMapping("/batchOps/{type}")
////    public ResponseBean batchOps(@PathVariable String type, Long[] ids) {
////
////        }
////        return ResponseBean.success();
////    }
//
//
//}
//
//
//
