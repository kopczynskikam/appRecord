package com.example.apprecord;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/login")
    public String showLoginForm() {
        return "/login";
    }

    @GetMapping("/logout")
    public String showLogoutForm() {
        return "/form-userLogout";
    }

    @ModelAttribute("nameOrgan")
    public List<String> nameOrgan() {
        return Arrays.asList("Policja", "Prokuratura");
    }
}
