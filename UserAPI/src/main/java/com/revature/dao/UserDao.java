package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.model.User;

public class UserDao {

	private Connection conn;
	
	public UserDao(Connection conn) {
		this.conn = conn;
	}
	
	public User getUserByUsername(String username) {

		try {
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE username = \'" 
					+ username + "\'");
			
			while (rs.next()) {
				
				String password = rs.getString("password");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String birthMonth = rs.getString("birth_month");
				
				return new User(username, password, firstName, lastName, birthMonth);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean createUser(User user) {
		
		Statement statement;
		try {
			statement = conn.createStatement();
			return statement.execute("INSERT INTO users VALUES ("
					+ "\'" + user.username + "\'"
					+ "\'" + user.password + "\'"
					+ "\'" + user.firstName + "\'"
					+ "\'" + user.lastName + "\'"
					+ "\'" + user.birthMonth + "\');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
