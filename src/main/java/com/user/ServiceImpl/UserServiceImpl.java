package com.user.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.Entity.User;
import com.user.Model.Department;
import com.user.Model.UserWithDept;
import com.user.Repository.UserRepository;
import com.user.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository repo;
	private final RestTemplate template;
	
	@Autowired
	public UserServiceImpl(UserRepository repo,RestTemplate template) {
		this.repo = repo;
		this.template= template;
	}
	
	@Override
	public User saveUser(User user) {
		return repo.save(user);
	}

	@Override
	public UserWithDept getUser(Long id) {
		UserWithDept info = new UserWithDept();
		User user = repo.findById(id).get();
		Department dept = template.getForObject("http://DEPARTMENT-SERVICE/dept/get/"+user.getDeptId(), Department.class);
		info.setUser(user);
		info.setDept(dept);
		return info;
	}

}
