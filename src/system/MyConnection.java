
package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Lenovo
 */

public class MyConnection {
    public static Connection getConnection(){
            
   Connection con = null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/librarysystem","root","");
}catch (Exception ex){
            System.out.println(ex.getMessage());
}
return con;
}
    PreparedStatement ps;
}
