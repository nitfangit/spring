package jdbc;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring?useUnicode=true&&characterEncoding=utf8&&useSSL=false&&serverTimezone=UTC","root","root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
