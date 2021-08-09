package guet.com.cn.guoyitangadmin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(String name,String id){
        System.out.println(name);
        System.out.println(id);
        return "test";
    }
}
