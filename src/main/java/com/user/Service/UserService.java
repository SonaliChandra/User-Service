package com.user.Service;

import com.user.Entity.User;
import com.user.Model.UserWithDept;

public interface UserService {
	
	public User saveUser(User user);
	
	public UserWithDept getUser(Long id);

}
