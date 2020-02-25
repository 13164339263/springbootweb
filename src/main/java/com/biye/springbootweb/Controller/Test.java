package com.biye.springbootweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class Test {

    //使用模板引擎thymeleaf
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        return "success";
    }

    //直接访问，失败(后来莫名其妙又可以了)
    @GetMapping("/home")
    public String home(){
        return "home"; //当浏览器输入/index时，会返回 /templates/home.html页面
    }

    //直接访问
    @GetMapping("/index")
    public String index(){
        return "index"; //当浏览器输入/index时，会返回 /templates/home.html页面
    }

}
