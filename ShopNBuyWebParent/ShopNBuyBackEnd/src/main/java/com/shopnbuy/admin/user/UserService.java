package com.shopnbuy.admin.user;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.common.entity.Role;
import com.common.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public List<User> listAll() {

		return (List<User>) userRepo.findAll();
	}

	public List<Role> listRoles() {
		return (List<Role>) roleRepo.findAll();
	}

	public void save(User user) {
		encodePassword(user);
		userRepo.save(user);
	}

	private void encodePassword(User user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
	}

	public boolean isEmailUnique(Integer id, String email) {
		User userByEmail = userRepo.getUserByEmail(email);

		// If no user is found with the given email, it's unique
		if (userByEmail == null) {
			return true;
		}

		// If we're creating a new user, we can't have an existing user with the same
		// email
		if (id == null) {
			return false; // Email is not unique
		}

		// If the found user has the same ID as the current user being updated, it's
		// unique
		return userByEmail.getId() == id;
	}

	public User get(Integer id) throws UserNotFoundException {
		try {
			return userRepo.getUserById(id);
		} catch (NoSuchElementException ex) {
			throw new UserNotFoundException("Could Not found user with ID " + id);
		}
	}

}
