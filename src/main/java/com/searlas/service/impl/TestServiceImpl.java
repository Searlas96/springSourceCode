package com.searlas.service.impl;

import com.searlas.annotation.Service;
import com.searlas.service.TestService;

@Service
public class TestServiceImpl implements TestService{

    @Override
    public String test() {
        return "TestServiceImpl.test()";
    }
}
