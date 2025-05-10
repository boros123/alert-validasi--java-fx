/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Lenovo
 */
public class Buku {
     private String kd_buku;  
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun_terbit;
    private String edisi;


    public Buku(String kd_buku,String judul,String pengarang,String penerbit,String tahun_terbit,String edisi) {
        this.kd_buku=kd_buku;
        this.judul = judul;  
         this.pengarang = pengarang;  
          this.penerbit = penerbit;  
           this.tahun_terbit = tahun_terbit; 
            this.edisi = edisi;  
    }

    public String getKd_buku() {
        return kd_buku;
    }

    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }
    
    
}
