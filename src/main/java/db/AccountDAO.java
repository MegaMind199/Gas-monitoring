package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.DBConnector;
import Modules.Account;

public class AccountDAO {

    // Method to get account by unique number
    public Account getAccountByUniqueNumber(String uniqueNumber) {
        Account account = null;

        // SQL query to select account details by unique_number
        String sql = "SELECT * FROM accounts WHERE unique_number = ?";

        try (Connection conn = DBConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, uniqueNumber);  // Set the unique_number parameter

            ResultSet rs = stmt.executeQuery();

            // If the account exists, retrieve the data
            if (rs.next()) {
                account = new Account();
                account.setId(rs.getInt("id"));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setEmail(rs.getString("email"));
                account.setPhoneNumber(rs.getString("phone_number"));
                account.setUniqueNumber(rs.getString("unique_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account; // Return the Account object, or null if not found
    }
}