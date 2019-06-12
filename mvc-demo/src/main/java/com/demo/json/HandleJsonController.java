package com.demo.json;

import com.demo.vo.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/json")
public class HandleJsonController {

    // 单个对象转为Json
    @RequestMapping("/test1")
    @ResponseBody
    public Cat test() {
        Cat cat = new Cat();
        cat.setName("mi mi");
        return cat;
    }


    // 多个对象转为Json
    @RequestMapping("/test2")
    @ResponseBody
    public List<Cat> test2() {
        Cat cat = new Cat();
        cat.setName("mi mi");
        return Arrays.asList(cat, cat, cat);
    }
}
