package com.demo.request;

import com.demo.vo.Cat;
import com.demo.vo.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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

    @InitBinder("cat")
    public void initBinderDogType(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("cat.");
    }

    @InitBinder("dog")
    public void initBinderCatType(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("dog.");
    }

    @RequestMapping("/save")
    public ModelAndView save(Cat cat, Dog dog) {
        System.out.println(cat);
        System.out.println(dog);
        return null;
    }

}
