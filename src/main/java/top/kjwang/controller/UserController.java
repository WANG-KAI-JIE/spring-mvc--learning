package top.kjwang.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.kjwang.entity.LoginUser;


/**
 * @author kjwang
 * @Date 2023/3/7 21:15
 */

@Controller
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(@RequestParam(value = "user_id") Integer id){
        System.out.println("id="+id);
        return "success";
    }

    /**
     * 向用户注册页面跳转
     */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    /**
     * 接收用户注册信息
     */
    @RequestMapping("/registerUser")
    public String registerUser(LoginUser user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username="+username);
        System.out.println("password="+password);
        return "success";

    }
}
