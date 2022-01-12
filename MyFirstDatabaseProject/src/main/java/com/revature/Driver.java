package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		
		try {
			// Class.forName ensures this class is loaded and avoids a ClassNotFoundException
			Class.forName("org.postgresql.Driver");
			
			String connectionString = "jdbc:postgresql://castor.db.elephantsql.com:5432/lfzclwhe",
					username = "lfzclwhe",
					password = "A1UNq_NkFNNbw9QlHNGDa-NiPeBGN1Zm";
			
			// Connection object is used to manage the network connection with the database
			Connection connection = DriverManager.getConnection(connectionString, username, password);
			
			// Statement object can be used to run queries and receive ResultSets
			Statement statement = connection.createStatement();
			
			// Any result of a SELECT query will be stored in a ResultSet
			ResultSet result = statement.executeQuery("SELECT * FROM apartments");
			
			// ResultSets have a built-in iterator that starts one row ABOVE the first row
			// This allows us to call while on its next() method, which moves it to the next row
			while (result.next()) {
				// While the internal iterator is stationed at a row, we can access the data of that row
				// using result.get<type>("column name")
				System.out.println("Id: " + result.getInt("apartment_id") + ", price: " 
						+ result.getDouble("price"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
