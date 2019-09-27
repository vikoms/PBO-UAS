
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class DBConnection {
    public static Connection getConnection(String host, String port, String username, String password, String db) {
        
        String konString = "jdbc:mysql://" + host + ":" + port + "/" +db; 
        Connection koneksi = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(konString,username,password);
            System.out.println("Koneksi Berhasil");
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("Koneksi gagal, coba nyalakan server");
        }
        
        return koneksi;
    }
}
