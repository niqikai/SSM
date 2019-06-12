package com.demo.request;

import com.demo.vo.FormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

@Controller
@RequestMapping("/request")
public class HandleRequestController {
    @Autowired
    private ServletContext servletContext;

    @RequestMapping("/test1")
    public void test1(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        System.out.println(request.getParameter("username"));
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        System.out.println(this.servletContext);
    }

    @RequestMapping("/test2")
    public void test2(@RequestParam(value = "username",required = false) String username)  {
        System.out.println(username);

    }


    @RequestMapping("/delete/{id}")
    public void test3(@PathVariable("id") Long id) {
        System.out.println(id);
    }

    /**
     *批量删除
     * 1。使用数组/batchDelete？ids=1&ids=2
     */
    @RequestMapping("/batchDelete")
    public void batchDelete(Long[] ids) {
        System.out.println(Arrays.asList(ids));
    }
    /**
     *批量删除
     * 2。使用List：不能直接用
     * /batchDelete？ids[0]=1&ids[1]=2
     */
    @RequestMapping("/batchDelete2")
    public void batchDelete2(FormBean bean) {
        System.out.println(bean.getIds());
    }

}
