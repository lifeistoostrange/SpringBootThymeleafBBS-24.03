package com.example.abbs.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.abbs.entity.User;


@Controller
@RequestMapping("/user")
public class UserController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/register")
	public String registerForm() {
		return "user/register";
	}
	
	@PostMapping("/register") 
	public String registerProc(MultipartHttpServletRequest req, Model model,
			String uid, String pwd, String pwd2, String uname, String email,
			String github, String insta, String location) {
		MultipartFile filePart = req.getFile("profile");
		String filename = null; 
		if (filePart.getContentType().contains("image")) {
			filename = filePart.getOriginalFilename();
		}
		User user = new User(uid, pwd, uname, email, LocalDate.now(), 0, filename, github, insta, location);
		log.info(user.toString());
		return "redirect:/user/login";
	}
	
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
}
