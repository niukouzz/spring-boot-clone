package com.song.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author King
 * @description api
 * @date 2020/8/20
 **/
@RestController
public class HomeController {

    @Value("${hschefu}")
    private String name;
    @Value("${hschefu1}")
    private String name1;

    @RequestMapping(value = "view02", method = RequestMethod.GET)
    public ModelAndView view (){
        System.out.println(1111);
        ModelAndView modelAndView = new ModelAndView("view");
        System.out.printf(name);
        modelAndView.addObject("name",name1);
        return modelAndView;
    }
}
