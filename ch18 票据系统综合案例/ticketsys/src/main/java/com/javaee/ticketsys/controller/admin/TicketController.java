//package com.javaee.ticketsys.controller.admin;
//
//import com.github.pagehelper.PageInfo;
//import com.javaee.ticketsys.controller.BaseController;
//import com.javaee.ticketsys.model.Ticket;
//import com.javaee.ticketsys.model.User;
//import com.javaee.ticketsys.model.bean.PageBean;
//import com.javaee.ticketsys.model.bean.ResponseBean;
//import com.javaee.ticketsys.model.bean.TicketQueryBean;
//import com.javaee.ticketsys.service.TicketService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * 普通用户用于提交票据，查看票据和编辑更新票据
// */
//@RestController
//@RequestMapping("ticket")
//public class TicketController extends BaseController {
//    static String prefix="/ticket/";
//
//    @Autowired
//    TicketService ticketService;
//
//    /**分页显示查询*/
//    @GetMapping("list")
//    public ResponseBean list(
//            @RequestParam(defaultValue = "1") int pageNum,
//            @RequestParam(defaultValue = "10") int pageSize,
//            @RequestParam(defaultValue = "id") String sortColumn,
//            @RequestParam(defaultValue = "asc") String sortOrder,
//            TicketQueryBean queryBean     //查询数据
//    ) {
//
//        log.info("分页请求" + pageNum + ";" + pageSize + sortColumn);
//        PageBean pageBean = new PageBean(pageNum, pageSize,sortColumn,sortOrder);
//        PageInfo<Ticket> pageInfo = ticketService.query(queryBean, pageBean);
//        return  ResponseBean.success(pageInfo);
//    }
//
//    /*添加票据*/
//    @PostMapping
//    public ResponseBean add(@RequestBody Ticket ticket) {
//        log.info("添加票据信息:"+ ticket.toString());
//        return  ResponseBean.success();
//    }
//
//    //获取票据信息
//    @GetMapping("{id}")
//    public ModelAndView view(@PathVariable("id") long id) {
//        log.info("读取用户信息,id=" + id);
//        Ticket ticket = ticketService.getById(id);
//        return new ModelAndView(prefix + "/view", "ticket", ticket);
//    }
//////
////    //使用GET方法获取用户对象
//    @PutMapping("/{id}")
//    public ModelAndView edit(@PathVariable("id") long id, Model model) {
////        log.info("读取用户信息,id=" + id);
////        User user = userService.getDetailsById(id);
////
////        List<Role> roleList = roleService.list();
////        model.addAttribute("user", user);
////        model.addAttribute("roleList", roleList);
//        return new ModelAndView(prefix + "/edit", "model", model);
//    }
//
//     /*量删除*/
//    @DeleteMapping
//    public ResponseBean delete(@RequestBody Long ids[]) {
//       ticketService.delete(ids);
//        return ResponseBean.success();
//    }
////
////    //删除多个用户
////
////    //更新
//    @PutMapping
//    public ResponseBean update(@RequestBody Ticket ticket) {
//        log.info(ticket.toString());
//        ticketService.update(ticket);
//        return ResponseBean.success();
//    }
////
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
