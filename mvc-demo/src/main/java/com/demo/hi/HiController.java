package com.demo.hi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiController {


    @RequestMapping("/hi")
    public ModelAndView sayHello() {
        System.out.println("sayHello ... ...");
        ModelAndView mv = new ModelAndView();

        // 设置视图名称
        mv.setViewName("welcome");
        // 设置共享数据
        mv.addObject("msg", "hello spring-mvc annotation");
        return mv;
    }
}
