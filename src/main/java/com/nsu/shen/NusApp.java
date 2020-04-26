package com.nsu.shen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@RequestMapping("/nsu")
public class NusApp{

    @RequestMapping("/shen")
    @ResponseBody
    public String hello() {
        return "hello world by shenzhuhao";
    }

    public static void main(String[] args) {
        SpringApplication.run(NusApp.class, args);
    }

}
