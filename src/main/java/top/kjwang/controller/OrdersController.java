package top.kjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.kjwang.entity.Orders;
import top.kjwang.entity.User;

/**
 * @author kjwang
 * @Date 2023/3/8 12:37
 */

@Controller
public class OrdersController {
    /**
     * 向订单查询页面跳转
     */
    @RequestMapping("/toFindOrdersWithUser")
    public String toFindOrdersWithUser(){
        return "orders";
    }

    /**
     * 查询订单和用户信息
     */
    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer orderId = orders.getOrderId();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("orderId=" + orderId);
        System.out.println("username=" + username);
        return "success";
    }
}
