package mysql_java_test;

import mysql_java_test.helper.DbConnections;
import mysql_java_test.entity.Movie;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DbConnections.connect()) {

            String sql = "SELECT * FROM movies";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                Movie movie = new Movie(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getInt("release_year")
                );
                System.out.println(movie);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }
}
