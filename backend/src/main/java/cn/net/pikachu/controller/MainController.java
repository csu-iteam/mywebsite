package cn.net.pikachu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pikachu on 2016/9/13 20:48 in
 * MainController
 */
@RestController
public class MainController {
    @RequestMapping("/")
    public String index(){
        return "welcome to mywebsite";
    }
}
