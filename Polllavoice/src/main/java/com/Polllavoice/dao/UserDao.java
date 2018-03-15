package com.Polllavoice.dao;
import com.Polllavoice.model.Login;
import com.Polllavoice.model.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
	}
