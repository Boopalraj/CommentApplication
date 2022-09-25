package com.zoho.commentapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho.commentapp.model.User;
import com.zoho.commentapp.service.UserServiceImpl;

@Controller
public class LoginController {

	@Autowired
	UserServiceImpl usrservice;

//	@Autowired
//	User user;

	@GetMapping("/")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "login";
	}

	@GetMapping("/register")
	public String login(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") User user) {
		return usrservice.registerUser(user);
	}

}
