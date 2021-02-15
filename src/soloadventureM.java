import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class soloadventureM {
    public static void main(String[] args) {
        try {
            // Set up connection to database
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://" + DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                            "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    DatabaseLoginData.user, DatabaseLoginData.password);

            Statement stmt = conn.createStatement();
            String SQLquery = "SELECT * FROM body";
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(
                        rset.getInt("id") + ", " +
                                rset.getString("title") + ", " +
                                rset.getString("author") + ", " +
                                rset.getDouble("price") + ", " +
                                rset.getInt("quantity")
                );
            }
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}
