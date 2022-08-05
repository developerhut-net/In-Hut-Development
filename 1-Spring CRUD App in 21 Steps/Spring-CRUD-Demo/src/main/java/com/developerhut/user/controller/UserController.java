package com.developerhut.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.developerhut.user.model.User;
import com.developerhut.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/createUser")
	public String createUser() {
		return "createUserPage";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user,
			ModelMap modelMap) {
		User savedUser = userService.add(user);
		String msg = "User saved with Id : "+savedUser.getId();
		modelMap.addAttribute("msg", msg);
		return "createUserPage";
	}
	
	@RequestMapping("viewUsers")
	public String viewUsers(ModelMap modelMap) {
		List<User> users = userService.getAll();
		modelMap.addAttribute("users", users);
		return "viewUsersPage";
	}
	
	@RequestMapping("/editUser")
	public String editUser(@RequestParam("id") int id,
			ModelMap modelMap) {
		User user = userService.findById(id);
		modelMap.addAttribute("user", user);
		return "editUserPage";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") User user,
			ModelMap modelMap) {
		User updatedUser = userService.update(user);
		
		modelMap.addAttribute("user", updatedUser);
		String msg = "User updated successfully";
		modelMap.addAttribute("msg", msg);
		return "editUserPage";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("id") int id,
			ModelMap modelMap) {
		userService.delete(id);
		
		List<User> users = userService.getAll();
		modelMap.addAttribute("users", users);
		return "viewUsersPage";
	}
}
