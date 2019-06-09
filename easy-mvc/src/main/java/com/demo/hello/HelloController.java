package com.demo.hello;

import com.demo.annotation.Controller;
import com.demo.bean.ModelAndView;

@Controller
public class HelloController {
    public ModelAndView sayHello() {
        System.out.println("sayHello... ...");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Welcome");
        mv.addAttribute("msg", "hello easyMVC");
        return mv;
    }
}
