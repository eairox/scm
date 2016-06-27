package com.mim.scannerproject.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	
	private static String username = "sa";
	private static String password = "mimi~100";
	private static String url = "jdbc:sqlserver://MVEPICOR:1433;databaseName=BCKPRODDIST";
	private static Connection con;
    private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 public static Connection getConnection() { 	
	
    	try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. 
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    		
	 }
}