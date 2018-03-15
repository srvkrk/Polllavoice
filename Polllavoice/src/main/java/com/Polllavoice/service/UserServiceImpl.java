package com.Polllavoice.service;
import com.Polllavoice.model.Login;
import com.Polllavoice.model.User;
import com.Polllavoice.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("processService")

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	public void register(User user) {
		try {
			userDao.register(user);
		}catch(Exception e){
			System.out.println("ERROR::::");
			e.printStackTrace();
		}
	}
	
	public User validateUser(Login login) {
		User users = null;
		try {
			users = userDao.validateUser(login);
			return users;
		}catch(Exception e){
			System.out.println("ERROR::::");
			e.printStackTrace();
			return users;
		}
	}
}


