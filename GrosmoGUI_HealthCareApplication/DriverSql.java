/* Code by Aadi Jain */

package Grosmo_Main.GrosmoGUI_HealthCareApplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class DriverSql {
    Connection con = null;
    java.sql.PreparedStatement pst;
    public static Connection dbconnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grosmo","root","");
            return conn;
        }catch (Exception e2){
            System.out.println(e2);
            return null;
        }

    }
}

/* Code by Aadi Jain */