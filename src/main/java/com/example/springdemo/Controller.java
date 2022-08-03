package com.example.springdemo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value="/test")
    public String testController(){
//        return "Test me";
        throw new NullPointerException();
    }

    @ExceptionHandler(value=NullPointerException.class)
    public String handleNPE(Exception e){
        return "Test NPE";
    }

    }
