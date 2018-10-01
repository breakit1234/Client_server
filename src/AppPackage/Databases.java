package AppPackage;
/*
 * @author OM
 */
import java.sql.*; 
public class Databases { 
    Connection make_connection() throws SQLException
    {
            //Creating the connection
            String url = "jdbc:mysql://localhost:3306/check?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "root";
            Connection con;
            con = DriverManager.getConnection(url,user,pass);
            return con;
     }
}