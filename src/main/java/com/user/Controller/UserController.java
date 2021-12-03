package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.Entity.User;
import com.user.Model.UserWithDept;
import com.user.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserService service;
	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping("/save")
	public User saveUser(@RequestBody User user)
	{
		return service.saveUser(user);	
	}
	
	@GetMapping("/get/{id}")
	public UserWithDept getUser(@PathVariable("id") Long id) {
		return service.getUser(id);
		}
}
