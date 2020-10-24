
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBAccess {
    private static Connection conn = null;
    public static Connection getConn() throws SQLException, ClassNotFoundException{
        Class.forName(IncomeTaxWagesCalculator.mysql.jdbc.Driver);
        if(conn == null){
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Income Tax and Wages Calculator","root", "");
        }
        return conn;
    }
    
}
