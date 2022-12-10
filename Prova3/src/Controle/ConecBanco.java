package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConecBanco {

    private String host;
    private String database;
    private String user;
    private String password;

    public ConecBanco(){
        this.host = "localhost";
        this.database = "bolão-tecprog";
        this.user = "root";
        this.password = "";
    }

    public Connection getConnection() {
        String url = String.format(
                "jdbc:mysql://%s/%s?verifyServerCertificate=false&useSSL=true",
                this.host, this.database);
        try {
            return DriverManager.getConnection(url, this.user, this.password);
        } catch (SQLException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        return null;
    }
}
