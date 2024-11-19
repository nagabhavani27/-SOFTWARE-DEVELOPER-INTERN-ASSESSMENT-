package com.Example.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import Util.Dbutil;



public class DeleteDao {
	public void deleteRegistration() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the record to delete:");
        int id = scanner.nextInt(); 

        String sql = "DELETE FROM Registration WHERE ID = ?";

        try (Connection conn = Dbutil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id); 

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No record found with the given ID.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
