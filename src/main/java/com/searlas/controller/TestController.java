package com.searlas.controller;

import com.searlas.annotation.Autowired;
import com.searlas.annotation.Controller;
import com.searlas.annotation.RequestMapping;
import com.searlas.service.TestService;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/index")
    public String index() {
        return "Test SpringMVC";
    }
}
