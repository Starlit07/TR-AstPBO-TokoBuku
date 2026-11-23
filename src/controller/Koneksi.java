/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksi {
    public static Connection con;
    public static Statement stm;
    
    //bikin kasir_db dulu di mysql
    public void config(){
        try {
            String url = "jdbc:mysql://127.0.0.1/kasir_db";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(url,user,pass);
            
            stm = (Statement)con.createStatement();
            System.out.println("Koneksi berhasil...");
        } catch (Exception e) {
            System.out.println("Koneksi gagal...");
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.config();
    }
}

