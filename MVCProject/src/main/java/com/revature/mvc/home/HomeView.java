package com.revature.mvc.home;

import com.revature.data.user.User;

public class HomeView {

	public String render(HomeModel model) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html><body>");
		
		sb.append("<ol>");
		for (User u : model.users) {
			sb.append("<li><p>" + u.firstName + " " + u.lastName 
					+ ", born in " + u.birthMonth + ".</p></li>");
		}
		sb.append("</ol>");
		
		sb.append("</body></html>");
		
		return sb.toString();
	}
}
