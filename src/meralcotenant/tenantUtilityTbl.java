package meralcotenant;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class tenantUtilityTbl extends sqlConnect {

    public tenantUtilityTbl() {

        try {
            Statement st;
            String sql = "CREATE TABLE tenantutility"
                    + "("
                    + "Date date,"
                    + "Tenant_Name VARCHAR(255),"
                    + "Previos_Reading BIGINT(20)"
                    + ")";
            st = con.createStatement();
            st.executeUpdate(sql);
            System.out.println("table created");
            JOptionPane.showMessageDialog(null, "Created new 'tenantutility' table");
        } catch (SQLException e) {

        }
    }

}
