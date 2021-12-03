package com.user.Model;
import com.user.Entity.User;

public class UserWithDept {
	
	private User user;
	private Department dept;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "UserWithDept [user=" + user + ", dept=" + dept + "]";
	}
	public UserWithDept(User user, Department dept) {
		super();
		this.user = user;
		this.dept = dept;
	}
	public UserWithDept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
