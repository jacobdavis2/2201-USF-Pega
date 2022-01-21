package com.revature.app;

import com.revature.user.User;
import com.revature.user.UserDao;

import io.javalin.Javalin;
import io.javalin.http.Handler;
import io.javalin.http.staticfiles.Location;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javalin app = Javalin.create( config -> {
			config.addStaticFiles("/html", Location.CLASSPATH);
		}).start(7070);
		
		app.post("/users/form", postUser);
	}

	public static Handler postUser = ctx -> {
		String username = ctx.formParam("username"),
				password = ctx.formParam("password"),
				firstName = ctx.formParam("firstName"),
				lastName = ctx.formParam("lastName"),
				birthMonth = ctx.formParam("birthMonth");
		
		//System.out.println(firstName + " " + lastName + " has just signed up!");
		User u = new User(username, password, firstName, lastName, birthMonth);
		
		UserDao dao = new UserDao(ConnectionManager.getConnection());
		dao.createUser(u);
		
		ctx.redirect("/index.html");
	};
}
