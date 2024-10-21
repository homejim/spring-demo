package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @RequestMapping("/test")
    public Integer test(Integer id){
        log.info("test01");
        return id;
    }

//
//    @RequestMapping("/test2")
//    public Integer test2(Integer id){
//        log.info("test02");
//        return id;
//    }

}
