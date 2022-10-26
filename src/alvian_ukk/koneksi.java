/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alvian_ukk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lenovo-ZA
 */

/**
 *
 * @author Lenovo-ZA
 */
public class koneksi {
    public static Connection koneksi() throws SQLException{
       Connection comn = null;
       String driver ="com.mysql.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/ukk_alvian";
       String user = "root";
       String pass = "";
        try {
            Class.forName(driver);
            comn = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi Gagal");
        }
    
    return comn;
    }
}