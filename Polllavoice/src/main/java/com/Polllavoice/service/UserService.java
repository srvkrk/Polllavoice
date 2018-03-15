package com.Polllavoice.service;
import com.Polllavoice.model.Login;
import com.Polllavoice.model.User;

 public interface UserService {
		void register(User user);
		User validateUser(Login login);
	}


