package com.namanmart.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.namanmart.store.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam(value="error", required = false)
            String error,
            @RequestParam(value="logout", required = false)
            String logout,
            Model model) {

        if(error != null) {
            model.addAttribute("error", "Invalid username and password");
        }

        if (logout !=null) {
            model.addAttribute("msg", "You have been logged out successfully");
        }

        return "login";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
