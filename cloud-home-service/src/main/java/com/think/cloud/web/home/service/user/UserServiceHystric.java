package com.think.cloud.web.home.service.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceHystric implements UserService{

	@Override
	public String sayName(String name) {
		return "sorry "+name;
	}

}
