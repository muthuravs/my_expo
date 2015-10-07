package com.myexpertise.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    
    @RequestMapping(value="/name", method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String getSampleString()
    {
        return "muthu";
    }
}
