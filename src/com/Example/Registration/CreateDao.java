package com.Example.Registration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

import Util.Dbutil;



public class CreateDao {
	public void createRegistration() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Date of Birth (YYYY-MM-DD):");
        String dobInput = scanner.nextLine();
        Date dob = Date.valueOf(dobInput); 

        System.out.println("Enter Phone Number:");
        long phone = scanner.nextLong(); 

        scanner.nextLine(); 

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        String sql = "INSERT INTO Registration (Name, Email, Dateofbirth, PhoneNumber, Address) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Dbutil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name); 
            stmt.setString(2, email); 
            stmt.setDate(3, dob); 
            stmt.setLong(4, phone); 
            stmt.setString(5, address); 

            stmt.executeUpdate();
            System.out.println("Registration created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	
	
	
	
	
	
	
	
	}
	
	 

}
