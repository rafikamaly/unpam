package uas.app.main;

import uas.app.config.Koneksi;
import uas.app.view.LoginForm;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainApp {

    public static void main(String[] args) {

        Connection conn = Koneksi.getConnection();

        if (conn != null) {
            System.out.println("Koneksi berhasil");

            new LoginForm().setVisible(true);

            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * from users");

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");

                    System.out.println(id + " | " + username + " | " + password);
                }

                rs.close();
                stmt.close();
                conn.close();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Koneksi gagal!");
        }
    }
}
