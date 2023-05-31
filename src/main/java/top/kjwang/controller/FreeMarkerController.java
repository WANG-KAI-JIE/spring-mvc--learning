package top.kjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.kjwang.convert.E;
import top.kjwang.entity.Item;
import top.kjwang.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kjwang
 * @Date 2023/3/7 19:14
 */

@Controller
@RequestMapping("/fm")
public class FreeMarkerController{
    @GetMapping("/test")
    public ModelAndView showTest(){
        ModelAndView mav = new ModelAndView("/test");
        User user = new User();
        user.setUsername("andy");
        mav.addObject("u",user);
        List<Item> items = List.of(
                new Item(1,"HTML5","1.png","HTML5 从入门到精通"),
                new Item(2,"CSS3","2.png","CSS3 从入门到精通"),
                new Item(1,"JavaScript","3.png","JavaScript 从入门到精通"));
        mav.addObject("items",items);
        return mav;
    }
}
