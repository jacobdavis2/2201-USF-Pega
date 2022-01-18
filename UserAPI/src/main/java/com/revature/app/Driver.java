package com.revature.app;

import java.sql.Connection;

import com.revature.controllers.UserController;

import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(7070);
		Connection conn = ConnectionManager.getConnection();
		UserController controller = new UserController(app, conn);
	}
}
