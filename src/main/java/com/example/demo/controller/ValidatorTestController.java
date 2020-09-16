package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试验证
 * @author 程就人生
 *
 */
@RestController
public class ValidatorTestController {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        return "hello";
    }
}
