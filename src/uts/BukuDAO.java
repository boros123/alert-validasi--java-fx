/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Lenovo
 */
public class BukuDAO {
    public static ObservableList<Buku> getBuku() {
        // ObservableList untuk menyimpan data user
        ObservableList<Buku> bukuList = FXCollections.observableArrayList();
        String query = "select * from buku";

        try {
            // Membuat koneksi ke database
            Connection koneksi = DBConnection.getConnection();
            // Membuat statement
            Statement stmt = koneksi.createStatement();
            // Query untuk mengambil data user
            ResultSet rs = stmt.executeQuery(query);
            
             // Menambahkan data ke ObservableList
              while (rs.next()) {
            String kd_buku = rs.getString("kd_buku");  
            String judul = rs.getString("judul");
            String pengarang = rs.getString("pengarang");
            String penerbit = rs.getString("penerbit");
            String tahun_terbit = rs.getString("tahun_terbit");
            String edisi = rs.getString("edisi");
            

            bukuList.add(new Buku(kd_buku,judul,pengarang,penerbit,tahun_terbit,edisi));
        }

            // Menutup koneksi
            rs.close();
            stmt.close();
            koneksi.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        
     
        return bukuList;
    }
    
    public static void addBuku(Buku buku) {
        String query = "INSERT INTO buku (kd_buku,judul,pengarang,penerbit,tahun_terbit,edisi) VALUES (?,?,?,?,?,?)";
    
    try {
        Connection koneksi = DBConnection.getConnection();
        PreparedStatement smt = koneksi.prepareStatement(query);
        
        smt.setString(1, buku.getKd_buku());
          smt.setString(2, buku.getJudul());
        smt.setString(3, buku.getPengarang());
          smt.setString(4, buku.getPenerbit());
            smt.setString(5, buku.getTahun_terbit());
              smt.setString(6, buku.getEdisi());
       
        
        smt.executeUpdate();
        
        smt.close();
        koneksi.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    public static void updateBuku(Buku buku) {
    String query = "UPDATE buku SET judul = ?,pengarang = ?,penerbit = ?,tahun_terbit = ?,edisi = ? WHERE kd_buku = ?";

    try (Connection koneksi = DBConnection.getConnection()) {
        PreparedStatement mst = koneksi.prepareStatement(query);
       
        mst.setString(1, buku.getJudul());
         mst.setString(2, buku.getPengarang());
          mst.setString(3, buku.getPenerbit());
           mst.setString(4, buku.getTahun_terbit());
            mst.setString(5, buku.getEdisi());
         mst.setString(6, buku.getKd_buku());

        mst.executeUpdate();
        mst.close();
        koneksi.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public static void deleteBuku(String kd_buku) {
    String query = "DELETE FROM buku WHERE kd_buku = ?";

    try (Connection koneksi = DBConnection.getConnection()) {
        PreparedStatement mst = koneksi.prepareStatement(query);
        mst.setString(1, kd_buku);

        mst.executeUpdate();
        mst.close();
        koneksi.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
 }
    
}
