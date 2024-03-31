package com.econovation.bangdong.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/info")
    public String info(HttpServletRequest request){
        String ip = request.getRemoteAddr();
        return ip;
    }
}
