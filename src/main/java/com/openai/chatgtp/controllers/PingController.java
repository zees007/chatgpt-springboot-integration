package com.openai.chatgtp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mhmdz
 * Created By Zeeshan on 11-11-2023
 * @project chatgtp
 */
@RestController
public class PingController {

    @GetMapping("/chat")
    public String chat(){
        return "Hi ChatGTP..!!";
    }



}
