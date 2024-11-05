package com.developerhut.inhutdev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.developerhut.inhutdev.entity.Post;
import com.developerhut.inhutdev.entity.User;
import com.developerhut.inhutdev.repository.PostRepository;
import com.developerhut.inhutdev.repository.UserRepository;

@Controller
public class LoginController {

	@GetMapping(value = {"/", "/index"})
	public String index() {
		return "index";
	}
	
	@GetMapping(value = {"/login"})
	public String login() {
		return "login";
	}
	
	@GetMapping(value = {"/welcome"})
	public String welcome(@AuthenticationPrincipal UserDetails userDetails, Model model) {
		
		String username = userDetails.getUsername();
		System.out.println(username + " Logged in successfully");
		
		User user = UserRepository.userMap.get(username);
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		model.addAttribute("user", user);
		
		return "welcome";
	}
	
	@GetMapping(value = {"/user"})
	@PreAuthorize("hasRole('USER')")
	public String user(@AuthenticationPrincipal UserDetails userDetails, Model model) {
		
		String username = userDetails.getUsername();
		System.out.println(username + " Logged in successfully");
		
		User user = UserRepository.userMap.get(username);
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		model.addAttribute("user", user);
		
		model.addAttribute("userList", UserRepository.userMap.values().stream().toList());
		
		return "user";
	}
	
	@GetMapping(value = "/post")
	@PreAuthorize("hasRole('POST')")
	public String post(Model model) {
		
		List<Post> userlist = new ArrayList<>(PostRepository.postMap.values());
		model.addAttribute("postlist", userlist);
		
		return "post";
	}
	
	@GetMapping(value = "/accessdenied")
	public String accessdenied() {
		return "accessdenied";
	}
	
}
