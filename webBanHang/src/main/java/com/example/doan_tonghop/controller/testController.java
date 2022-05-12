package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.model.user;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("DoAn_CNPM")
public class testController {
    @GetMapping("home")
    public String Home(Model model)
    {
        user u = new user();
        u.setName("DucAnh");
        u.setMssv("6263");
        model.addAttribute("test",u);
        return "home";
    }
    @GetMapping("products")
    public String Products()
    {
        return "products";
    }
    @GetMapping("combo")
    public String Combo()
    {
        return "combo";
    }
    @GetMapping("products/{id}")
    public String Products (@PathVariable("id") long id)
    {
            return "productsDetail";
    }
    @GetMapping("combo/{id}")
    public String Combo (@PathVariable("id") long id)
    {
        return "comboDetail";
    }
}