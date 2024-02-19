
package Model;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Database {
private static Database instance;

 
    private Connection connection;
    public static Database getInstance(){
        if (instance==null) {
            instance = new Database();
        }
        return instance;
    }
    private Database(){
        
    }
    public void ConnectToDatabase() throws  SQLException, ClassNotFoundException{
        String server = "127.0.0.1";
        String port = "3306";
        String database ="usertable";
        String user = "root";
        String password = "qwerty123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+database,user,password);
    }
    public Connection getConnection() {
        return connection;
    }
}
