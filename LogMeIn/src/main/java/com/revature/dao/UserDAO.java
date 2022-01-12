package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {

	public boolean isUsernameTaken(String username) {
		
		try {
			// 1. Create a Statement
			Connection c = ConnectionManager.getConnection();
			//Statement statement = c.createStatement();
			
			PreparedStatement preparedStatement = c.prepareStatement("SELECT * FROM users WHERE username = ?");
			preparedStatement.setString(1, username);
			
			// 2. Run a query using the statement to find any records with the given username
			//ResultSet results = statement.executeQuery("SELECT * FROM users WHERE username = \'" + username + "\'");
			ResultSet results = preparedStatement.executeQuery();
			
			// 3. If there is more than 0 records, we'll return false. Otherwise true.
			/*int size = results.getFetchSize();
			if (size > 0)
				// The username IS taken = true
				return true;*/
			if (results.next())
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
