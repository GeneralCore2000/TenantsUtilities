package meralcotenant;

import java.sql.ResultSet;
import java.sql.Statement;

public class retrievePreviousReading extends sqlConnect {
    
    
    public retrievePreviousReading() {
        ResultSet rs;
        try {
            Statement st;
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * from tenantutility";
            rs = st.executeQuery(sql);
            
            rs.last();
            rs.absolute(rs.getRow()); //THIN
            int thinReading = rs.getInt("previous_reading");
            
            rs.last();
            rs.absolute(rs.getRow() - 1); //REMY
            int remyReading = rs.getInt("previous_reading");
            
            rs.last();
            rs.absolute(rs.getRow() - 2); //MAIK
            int maikReading = rs.getInt("previous_reading");
            
            rs.last();
            rs.absolute(rs.getRow() - 3); //PRECY
            int precyReading = rs.getInt("previous_reading");
            
            TenantsUtility.getNewPreviousReading(precyReading, maikReading, remyReading, thinReading);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
