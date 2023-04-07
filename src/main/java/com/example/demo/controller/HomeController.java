package com.example.demo.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Value("${demo.mysql.url}")
    public String mysqlUrl;

    public String getMysqlUrl() {
        return mysqlUrl;
    }

    @Bean
    void sysout(){
        System.out.println("beannnnnn");
        //HomeController homeController = new HomeController();
        System.out.println(mysqlUrl);
    }

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/hi")
    @ResponseBody
    public String dung() {
        System.out.println("ahihihi232");
        return "dung";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<String> listTest() {
        System.out.println("list test");
        List<String> list = new ArrayList<>();
        list.add("Nguyen");
        list.add("dung");
        list.add("ahihi");
        return list;
    }

    @GetMapping("/name")
    public String name(
            @RequestParam(name = "name", required = false, defaultValue = "ly chien") String name, Model model) {
        model.addAttribute("name", name);
         return "name";
    }
}
