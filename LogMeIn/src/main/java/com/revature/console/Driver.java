package com.revature.console;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.dao.ConnectionManager;

public class Driver {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			while (true) {
				Menu menu = new Menu();
				menu.mainMenu(scanner);
			}
		} finally {
			// When the program is stopped, this will trigger and close the connection
			// You have to use the stop button in your IDE. Similar to finalize in ConnectionManager
			try {
				ConnectionManager.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
