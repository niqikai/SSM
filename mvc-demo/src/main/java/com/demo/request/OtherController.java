package com.demo.request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/other")
public class OtherController {

    @RequestMapping("/test1")
    public ModelAndView test1(@RequestHeader("User-Agent") String userAgent) {

        System.out.println("test ... ...");
        System.out.println(userAgent);
        return null;
    }
}
