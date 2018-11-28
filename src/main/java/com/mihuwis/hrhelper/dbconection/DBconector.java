package com.mihuwis.hrhelper.dbconection;

import java.sql.*;

public class DBconector {
    ConnectionDataParser connectionDataParser = new ConnectionDataParser();
    private Connection connection = null;

    public Connection getConection() {
        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    private void createConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/" + connectionDataParser.getDataBaseURL(),
                    connectionDataParser.getDataBaseUser(), connectionDataParser.getDataBasePassword());
        } catch (SQLException e) {
            System.err.println("Wrong connection data");
            e.getErrorCode();
            e.getSQLState();
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.getCause();
            e.getException();
        }
    }

    public Statement getStatement(Connection connection) throws SQLException{
        return connection.createStatement();
    }
}


