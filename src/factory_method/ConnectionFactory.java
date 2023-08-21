package factory_method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db",
                    "root", "123");

            return connection;
        } catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }

}
