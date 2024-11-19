package com.Example.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.Dbutil;



public class ReadDao {
	public void readRegistration() {
        String sql = "SELECT * FROM Registration";
        try (Connection conn = Dbutil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Date of Birth: " + rs.getDate("DateOfBirth"));
                System.out.println("Phone: " + rs.getString("PhoneNumber"));
                System.out.println("Address: " + rs.getString("Address"));
                System.out.println("-----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
