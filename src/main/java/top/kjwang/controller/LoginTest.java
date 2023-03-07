package top.kjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.kjwang.entity.User;

/**
 * @author kjwang
 * @Date 2023/3/7 16:52
 */
@Controller
public class LoginTest {
    //跳转至登录界面

    //测试登录信息
    @PostMapping(value = "/login",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String postMapping(User user) {
        if (!user.getUsername().equals("")) {
            System.out.println(user.getUsername() + ":" + user.getPassword());
            return "<fieldset><legend>登陆成功</legend>用户名：" +user.getUsername()+ "<br>密码："+user.getPassword()+"</fieldset>";
        }
        return "error";
    }
}