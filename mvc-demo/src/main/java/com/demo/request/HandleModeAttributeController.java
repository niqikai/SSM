package com.demo.request;

import com.demo.vo.FormBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request")
public class HandleModeAttributeController {


    @RequestMapping("/test1")
    public String test1(@ModelAttribute("fb") FormBean bean) {
        System.out.println(bean);
        return "result";
    }
}
