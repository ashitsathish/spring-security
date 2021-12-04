package com.ashitsathish.springbootsecuritystarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ashitsathish on Dec,2021
 */
@RestController
@RequestMapping(path = "/welcome")
public class UserController {
    @GetMapping
    public String welcome(){
        return "Welcome";
    }
}
