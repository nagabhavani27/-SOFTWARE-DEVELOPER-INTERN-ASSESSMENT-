package com.Example.Registration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

import Util.Dbutil;



public class UpdateDao {
	public void updateRegistration() {
		 Scanner scanner = new Scanner(System.in);

	  
	        System.out.println("Enter the ID of the record to update:");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.println("Enter the new Name:");
	        String name = scanner.nextLine();

	        System.out.println("Enter the new Email:");
	        String email = scanner.nextLine();

	        System.out.println("Enter the new Date of Birth (YYYY-MM-DD):");
	        String dobInput = scanner.nextLine();
	        Date dob = Date.valueOf(dobInput); 

	        String sql = "UPDATE Registration SET Name = ?, Email = ?, DateOfBirth = ? WHERE ID = ?";

	        try (Connection conn = Dbutil.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {

	            
	            stmt.setString(1, name);
	            stmt.setString(2, email);
	            stmt.setDate(3, dob);
	            stmt.setInt(4, id); 

	            int rowsAffected = stmt.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Record updated successfully.");
	            } else {
	                System.out.println("No record found with the given ID.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


}
