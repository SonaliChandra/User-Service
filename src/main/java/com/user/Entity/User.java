package com.user.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	public Long getUderId() {
		return uderId;
	}
	public void setUderId(Long uderId) {
		this.uderId = uderId;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uderId;
	private String userName;
	private Long deptId;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "User [uderId=" + uderId + ", userName=" + userName + ", deptId=" + deptId + "]";
	}
	public User(Long uderId, String userName, Long deptId) {
		super();
		this.uderId = uderId;
		this.userName = userName;
		this.deptId = deptId;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
