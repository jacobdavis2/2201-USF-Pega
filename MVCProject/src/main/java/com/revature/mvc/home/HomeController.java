package com.revature.mvc.home;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class HomeController {

	public HomeController(Javalin app) {
		
		app.get("/home", homeHandler);
	}
	
	public Handler homeHandler = ctx -> {
		HomeView view = new HomeView();
		ctx.html(view.render(new HomeModel()));
	};
}
