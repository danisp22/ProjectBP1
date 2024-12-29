package frame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
        
/**
 *
 * @author LENOVO IDEAPAD 110
 */
public class konektor {
    Connection connect;
    
    public konektor() {
        String id, pass, driver, url;
        id = "root";
        pass = "";
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/aka_cell";
        
        try {
            Class.forName(driver).newInstance();
            connect = DriverManager.getConnection(url, id, pass);
            JOptionPane.showMessageDialog(null, "Connection Successful");
        } catch (Exception err) {
            System.err.println("" + err.getLocalizedMessage());
        }
    }
    
    public static void main(String[] args) {
        konektor connect = new konektor();
    }
}
