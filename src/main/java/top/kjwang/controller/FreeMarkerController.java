package top.kjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.kjwang.entity.User;

/**
 * @author kjwang
 * @Date 2023/3/7 19:14
 */

@Controller
@RequestMapping("/fm")
public class FreeMarkerController {
    @GetMapping("/test")
    public ModelAndView showTest(){
        ModelAndView mav = new ModelAndView("/test");
        User user = new User();
        user.setUsername("tom");
        mav.addObject("u",user);
        return mav;
    }
}
