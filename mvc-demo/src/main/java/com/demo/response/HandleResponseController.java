package com.demo.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/response")
public class HandleResponseController {

    // 返回void类型，此时可以把Controller方法当作Servlet来使用
    @RequestMapping("/test1")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("test1");
        // 请求转发
        request.getRequestDispatcher("").forward(request, response);
        //URL重定向
        response.sendRedirect("");
        //设置共享数据
        request.setAttribute("", "");
        // 输出JSON
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().println("");
    }
    // 返回void：文件下载
    @RequestMapping("/test2")
    public void test2(OutputStream out) {

    }


    // 返回 ModelAndView
    @RequestMapping("/test3")
    public ModelAndView test3() {
        System.out.println("test3");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "返回ModelAndView");
        mv.setViewName("result");
        return mv;
    }

    // 返回String， 逻辑视图名称，此时需结合Model参数一起使用
    @RequestMapping("/test4")
    public String test4(Model model) {
        model.addAttribute("msg", "哈哈哈哈");

        return "result";
    }

}




