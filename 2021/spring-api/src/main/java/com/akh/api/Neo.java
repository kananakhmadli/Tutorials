package com.akh.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Neo {

    @RequestMapping(value = "/neo")
    public String foo() {
        return "foo is called";
    }
}
