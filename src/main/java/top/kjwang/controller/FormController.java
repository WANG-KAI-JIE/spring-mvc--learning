package top.kjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author kjwang
 * @Date 2023/3/7 17:02
 */

@Controller
public class FormController {
    @PostMapping(value = "/form",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String form(@RequestParam(value = "name",defaultValue = "ANON") String name,String course,@RequestParam List<String> purpose){
        System.out.println(name);
        System.out.println(course);
        String str = null;
        for (String s : purpose) {
            System.out.println(s);
//            switch (s) {
//                case 1:
//                    str.concat("就业");
//                    continue;
//                case 2:
//                    str.concat("工作需求");
//                    continue;
//                case 3:
//                    str.concat("能力提升");
//                    continue;
//                case 4:
//                    str.concat("兴趣爱好");
//                    continue;
//                case 5:
//                    str.concat("其他");
//                    continue;
//            }
        }
//        return "SUCCESS";
        return "<fieldset><legend>提交成功！</legend>姓名：" +name+ "<br>技术方向："+course+"<br>学习目的："+purpose+"</fieldset>";
    }
}
