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
    }
}

