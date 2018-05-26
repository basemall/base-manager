package com.ibase.mall.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Autor liaoxiongjian
 * @Date 2018/5/14 9:06
 * @Version 1.0
 */
@RestController
public class IndexController {

    //
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }


    @RequestMapping("/index_v1")
    public ModelAndView index_v1(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index_v1");
        return mv;
    }


    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }
}
