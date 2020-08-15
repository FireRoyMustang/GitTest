package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@Description
 *@Author ShenYubo
 *@Date 2020/8/15 10:32
 *@Version V1.0
 **/
@Controller
public class HelloWorld {
    /**
     * 1、通过RequestMapping映射请求的url
     * 2、返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceView视图解析器，会做如下的解析
     * @return
     */
    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }
}
