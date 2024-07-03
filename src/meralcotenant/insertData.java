package meralcotenant;

import java.sql.PreparedStatement;
import java.util.Date;

public class insertData extends sqlConnect {

    Date d = new Date();
    java.sql.Date sqlDate = new java.sql.Date(d.getTime());

    public insertData(String tenant1, String tenant2, String tenant3, String tenant4,
            int cr1, int cr2, int cr3, int cr4) {
        try {
            String sql = "INSERT INTO tenantutility VALUES(?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, sqlDate);
            ps.setString(2, tenant1);
            ps.setInt(3, cr1);
            ps.execute();
            ps.setDate(1, sqlDate);
            ps.setString(2, tenant2);
            ps.setInt(3, cr2);
            ps.execute();
            ps.setDate(1, sqlDate);
            ps.setString(2, tenant3);
            ps.setInt(3, cr3);
            ps.execute();
            ps.setDate(1, sqlDate);
            ps.setString(2, tenant4);
            ps.setInt(3, cr4);
            ps.execute();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
