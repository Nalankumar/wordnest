package com.tnk.wordnest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tnk.wordnest.entity.User;
import com.tnk.wordnest.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@GetMapping("/register")
	public String register(Model model) {
		return "register";
	}
	
	@PostMapping("/register")
	public String save(@ModelAttribute User user) {
		userService.createUser(user);
		return "redirect:/";
	}
}
