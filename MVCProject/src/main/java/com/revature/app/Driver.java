package com.revature.app;

import com.revature.mvc.home.HomeController;

import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(7070);
		HomeController homeController = new HomeController(app);
	}
}
