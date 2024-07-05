package meralcotenant;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class retrievePreviousReading extends sqlConnect {

    public retrievePreviousReading() {
        ResultSet rs;
        ArrayList<Integer> previousReading = new ArrayList<>();
        try {
            Statement st;
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * from tenantutility";

            rs = st.executeQuery("SELECT COUNT(*) FROM tenantutility");
            int numberOfRows = 0;
            while (rs.next()) {
                numberOfRows = rs.getInt(1);
            }
            rs = st.executeQuery(sql);
            int ctr = 0;
            while (rs.next()) {
                if (ctr >= numberOfRows - 4) {
                    previousReading.add(rs.getInt("previous_reading"));
                }
                ctr++;
            }
            int tenant1 = previousReading.get(0);
            int tenant2 = previousReading.get(1);
            int tenant3 = previousReading.get(2);
            int tenant4 = previousReading.get(3);

            TenantsUtility.getNewPreviousReading(tenant1, tenant2, tenant3, tenant4);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
