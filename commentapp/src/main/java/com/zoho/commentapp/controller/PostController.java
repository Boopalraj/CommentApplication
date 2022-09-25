package com.zoho.commentapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zoho.commentapp.model.Post;
import com.zoho.commentapp.service.UserServiceImpl;

@Controller
public class PostController {

	@Autowired
	UserServiceImpl usrservice;

	@PostMapping("/writeComment")
	public String writeComment(@ModelAttribute("post") Post post, Model model) {
		model.addAttribute("post", new Post());
		usrservice.postComments(post);
		return "comment";
	}
}
