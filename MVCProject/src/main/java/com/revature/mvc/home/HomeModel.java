package com.revature.mvc.home;

import java.util.ArrayList;

import com.revature.app.ConnectionManager;
import com.revature.data.user.User;
import com.revature.data.user.UserDao;

public class HomeModel {

	ArrayList<User> users;
	
	public HomeModel() {
		UserDao dao = new UserDao(ConnectionManager.getConnection());
		users = dao.getAllUsers();
	}
}
