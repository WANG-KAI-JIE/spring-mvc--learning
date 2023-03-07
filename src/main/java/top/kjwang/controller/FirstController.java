package top.kjwang.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import top.kjwang.entity.User;

/**
 * @author kjwang
 * @Date 2023/3/7 14:09
 */
public class FirstController implements Controller {
    User user = new User();
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 创建模型视图对象
        ModelAndView mav = new ModelAndView();
        // 向模型中添加数据
        mav.addObject("msg","我的第一个 Spring MVC 应用");
        mav.addObject("name","肥猫猫");
        mav.addObject("place","六餐厅");
        mav.addObject("food","烤鱼");

        mav.addObject(user);
        // 设置视图名称
        mav.setViewName("/WEB-INF/jsp/first.jsp");

        return mav;
    }
}
