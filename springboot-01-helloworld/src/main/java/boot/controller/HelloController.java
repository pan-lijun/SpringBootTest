package boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@ResponseBody
//@Controller

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello01(){
        System.out.println("hello,git");
        System.out.println("hello,git");
        System.out.println("hello,git1");
        System.out.println("hello,git2");
        System.out.println("push Test");
        System.out.println("pull Test");
        return "hello,springBoot2";
    }
}
