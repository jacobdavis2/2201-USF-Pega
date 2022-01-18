package com.revature.controllers;

import java.sql.Connection;

import com.revature.dao.UserDao;
import com.revature.model.User;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class UserController {

	Javalin app;
	Connection conn;
	UserDao userDao;
	
	public UserController(Javalin app, Connection conn) {
		this.app = app;
		this.conn = conn;
		userDao = new UserDao(conn);
		
		app.get("/users/{username}", getUserByUsername);
		app.post("/users", createNewUser);
	}
	
	public Handler getUserByUsername = ctx -> {
		User u = userDao.getUserByUsername(ctx.pathParam("username"));
		ctx.json(u);
	};
	
	public Handler createNewUser = ctx -> {
		User u = ctx.bodyAsClass(User.class);
		userDao.createUser(u);
	};
}
