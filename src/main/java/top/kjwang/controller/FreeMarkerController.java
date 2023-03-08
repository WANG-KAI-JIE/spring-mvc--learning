package top.kjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.kjwang.convert.E;
import top.kjwang.entity.User;

import java.util.ArrayList;

/**
 * @author kjwang
 * @Date 2023/3/7 19:14
 */

@Controller
@RequestMapping("/fm")
public class FreeMarkerController{
    @RequestMapping("/test")
    @ResponseBody
    public String showTest(Model model){
        ArrayList<Object> lists = new ArrayList<>();
        {
            E e1 = E.builder()
                    .url("https://spring.io/img/icons/microservices.svg")
                    .name("Microservices")
                    .content("Quickly deliver production‑grade features with independently evolvable microservices.")
                    .build();
            E e2 = E.builder()
                    .url("https://spring.io/img/icons/reactive.svg")
                    .name("Reactive")
                    .content("Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.")
                    .build();
            E e3 = E.builder()
                    .url("https://spring.io/img/icons/cloud.svg")
                    .name("Cloud")
                    .content("Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.")
                    .build();
            E e4 = E.builder()
                    .url("https://spring.io/img/icons/web-apps.svg")
                    .name("Web apps")
                    .content("Frameworks for fast, secure, and responsive web applications connected to any data store.")
                    .build();
            E e5 = E.builder()
                    .url("https://spring.io/img/icons/serverless.svg")
                    .name("Serverless")
                    .content("The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.")
                    .build();
            E e6 = E.builder()
                    .url("https://spring.io/img/icons/event-driven.svg")
                    .name("Event Driven")
                    .content("Integrate with your enterprise. React to business events. Act on your streaming data in realtime.")
                    .build();
            E e7 = E.builder()
                    .url("https://spring.io/img/icons/batch.svg")
                    .name("Batch")
                    .content("Automated tasks. Offline processing of data at a time to suit you.")
                    .build();
            lists.add(e1);
            lists.add(e2);
            lists.add(e3);
            lists.add(e4);
            lists.add(e5);
            lists.add(e6);
            lists.add(e7);
        }
        model.addAttribute("lists",lists);
        System.out.println(lists.toString());
        return model.toString();
    }
}
