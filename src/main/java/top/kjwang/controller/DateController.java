package top.kjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author kjwang
 * @Date 2023/3/8 12:58
 */

@Controller
public class DateController {
    /**
     * 使用自定义类型数据绑定日期数据
     */
    @RequestMapping("/customDate")
    public String customDate(Date date){
        System.out.println("date="+date);
        return "success";
    }
}
