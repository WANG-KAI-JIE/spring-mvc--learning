package top.kjwang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.kjwang.entity.User;

/**
 * @author kjwang
 * @Date 2023/3/7 14:48
 */

@RestController
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello test";
    }

    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setUsername("咪咪");
        user.setPassword("123");
        return user;
    }

//    @GetMapping("/images")
//    public

}
