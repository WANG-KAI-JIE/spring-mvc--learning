package top.kjwang.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import top.kjwang.entity.User;

/**
 * @author kjwang
 * @Date 2023/3/7 14:48
 */

@Controller
public class TestController {
    @RequestMapping(value = "/test")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","我的第一个 Spring MVC 程序");
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }
    @RequestMapping(value="/first")
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response,
                                Model model) {
        // 向模型对象中添加数据
        model.addAttribute("msg", "这是我的第一个Spring MVC程序");
        // 返回视图页面
        return "/WEB-INF/jsp/first.jsp";
    }

    @RequestMapping(value="/update")
    public String update(HttpServletRequest request,
                         HttpServletResponse response,
                         Model model){
        model.addAttribute("msg", "这是我的第一个Spring MVC程序");
        // 重定向请求路径
        return "redirect:first";
    }

//    @RequestMapping(value="/edit")
//    public String update(HttpServletRequest request,
//                         HttpServletResponse response,
//                         Model model){
//        model.addAttribute("msg", "这是我的第一个Spring MVC程序");
//        // 请求转发
//        return "forward:first";
//    }
}
