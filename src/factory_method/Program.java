package factory_method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM TABLE");
        //...


    }
}
