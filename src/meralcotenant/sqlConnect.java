package meralcotenant;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class sqlConnect {

    Connection con;

    public sqlConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12717598", "sql12717598", "8PWHPTPPrr");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database error connection: " + e);
        }

    }
}
