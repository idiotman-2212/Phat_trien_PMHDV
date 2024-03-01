package com.foodorder.Foodorder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("about")
    public String about(){
        return "about";
    }

    @GetMapping("booking")
    public String booking(){
        return "booking";
    }

    @GetMapping("contract")
    public String contract(){
        return "contract";
    }

    @GetMapping("menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("service")
    public String service(){
        return "service";
    }

    @GetMapping("team")
    public String team(){
        return "team";
    }

    @GetMapping("testimonial")
    public String testimonial(){
        return "testimonial";
    }
}
