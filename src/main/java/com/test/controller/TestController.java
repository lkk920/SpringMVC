package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于测试SpringMVC操作
 *
 * @author 梁楷楷
 * @create 2017-01-11 13:16
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("test1")
    public String test1(){
        return "test1";
    }
    @RequestMapping("test2")
    public ModelAndView test2(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name","张三");
        return new ModelAndView("test2",map);
    }
}
