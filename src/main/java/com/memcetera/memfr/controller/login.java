package com.memcetera.memfr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@RequestMapping("/")
@Controller
public class login {

    @GetMapping("/connec")
    public String connection( @RequestParam String username, @RequestParam String password) {

        if (username.equals("user") && password.equals("pass")) {
            return "Connected";
        }

        return "error";
    }

}
