package com.gahui.modules.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {


    private static Logger logger = LoggerFactory.getLogger(TestController.class);



    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public String test(){
        logger.debug("开始测试");
        System.out.printf("test");
        return "test";
    }



}
