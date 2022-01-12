package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {

	public boolean isUsernameTaken(String username) {
		
		try {
			// 1. Create a Statement
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			
			// 2. Run a query using the statement to find any records with the given username
			ResultSet results = statement.executeQuery("SELECT * FROM users WHERE username = \'" + username + "\'");
			
			// 3. If there is more than 0 records, we'll return false. Otherwise true.
			int size = results.getFetchSize();
			if (size > 0)
				// The username IS taken = true
				return true;
			
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public void signUp(String username, String password) {

		try {
			Connection c = ConnectionManager.getConnection();
			Statement statement = c.createStatement();
			
			int rowsAffected = statement.executeUpdate("INSERT INTO users VALUES (\'" + username 
					+ "\', \'" + password + "\')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
