package com.think.cloud.service.user.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_info")
public class UserInfo extends BaseEntity{
	@Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo(Integer id){
		super();
		this.id = id;
	}
	
	public UserInfo(Integer id,String phone){
		super();
		this.id = id;
		this.phone = phone;
	}
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
