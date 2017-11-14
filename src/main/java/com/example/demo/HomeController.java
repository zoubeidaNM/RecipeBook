package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        return "recipebook";
    }
    @RequestMapping("/menu")
    public String menuPage() {
        return "recipebookmenu";
    }
    @RequestMapping("/list")
    public String listPage() {
        return "recipelist";
    }
    @RequestMapping("/crabcake")
    public String carbcakePage() {
        return "crabbypage";
    }
    @RequestMapping("/wings")
    public String wingsPage() {
        return "wings";
    }
    @RequestMapping("/makhrouds")
    public String makhroudsPage() {
        return "makhrouds";
    }
    @RequestMapping("/eggsauce")
    public String eggsaucePage() {
        return "eggsauce";
    }
    @RequestMapping("/injera")
    public String injeraPage() {
        return "injera";
    }
    @RequestMapping("/gulabjamun")
    public String gulabjamunPage() {
        return "gulabjamun";
    }
}
