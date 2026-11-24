package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import model.Admins;

public class AdminsController {
    public Statement stm;
    public ResultSet res;
    public String sql;
    
    // CONSTRUCTOR
    public AdminsController() {
        // Koneksi Database
        Koneksi db = new Koneksi();
        db.config();
        this.stm = db.stm;
    }
    
    // METHOD celLogin
    public boolean cekLogin(String un, String pw) {
        Admins adm = new Admins();
        adm.setUsername(un);
        adm.setPassword(pw);
        boolean status = false;
        
        // Quesry ke database + cekLogin
        try {
            // sql query
            this.sql = "SELECT * FROM tb_admin WHERE username = '"+ adm.getUsername() +"' AND password = '"+ adm.getPassword() +"'";
            
            // Menjalankan query : Khusus SELECT pakai "executeQuesry"
            this.res = this.stm.executeQuery(sql);
            
            // Pengecekan
            if (res.next()) status = true;
            else status = false;          
        } catch (Exception e) {
            System.out.println("Query Gagal");
        }
        return status;
    }
}
