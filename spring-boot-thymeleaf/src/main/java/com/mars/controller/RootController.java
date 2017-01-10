package com.mars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangyuchi on 10/01/2017.
 */
@Controller
public class RootController {

    @RequestMapping("/")
    public String greeting() {
        return "index";
    }

}
