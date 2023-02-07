package com.springboot.JdbcCrud.repository;

import com.springboot.JdbcCrud.model.*;
import java.util.List;


public interface UserRepository {

	User saveUser(User user);
	User updateUser(User user);

	String deleteById(int id);
	List<User> allUsers();
	
	 User getById(int id);
	
	
}
