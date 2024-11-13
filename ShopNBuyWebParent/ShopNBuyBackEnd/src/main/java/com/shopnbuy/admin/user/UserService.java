package com.shopnbuy.admin.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.common.entity.User;

@Service
public class UserService {

	//@Autowired
	private UserRepository repo;
	
	public List<User> listAll() {
		
	return (List<User>) repo.findAll();
	}
	
}
