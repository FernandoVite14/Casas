/*
    Autor: Jesús Vite
    Fecha Creación : 8 mar 2022, 10:26:30
    Fecha Actualización:
    Descripción:clase java Conexion de conexión a BD
 */
package db;
import java.sql.*;
public class Conexion {
    private Connection connection;
    private String url;
    private String user;
    private String pwd;

    public Conexion() {
    }

    public Conexion(Connection connection) {
        this.connection = connection;
    }

    public Conexion(String url, String user, String pwd) {
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }
    
    

    public Connection getConnection() {
        try{
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection("jdbc:postgresql://"+url, user, pwd);
            System.out.println("Conexión exitosa");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return connection;
    }
    
    public void getDesconnection(){
        try{
            getConnection().close();
            System.out.println("Conexión a DB finalizada");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    public static void main(String[] args) {
        Conexion con = new Conexion("localhost/casas","postgres","medinagris");
        con.getConnection();
        con.getDesconnection();
    }

    
}
