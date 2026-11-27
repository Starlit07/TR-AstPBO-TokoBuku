package model;

import java.time.LocalDateTime;

public class Transaksi {
    private int idTransaksi;
    private LocalDateTime tanggalTransaksi;
    private int idUser;
    private double subTotal;
    private double diskon;
    private double totalHarga;

    public Transaksi(int idTransaksi, 
                        LocalDateTime tanggalTransaksi,
                        int idUser, 
                        double subTotal,
                        double diskon, 
                        double totalHarga){
        this.idTransaksi = idTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.idUser = idUser;
        this.subTotal = subTotal;
        this.diskon = diskon;
        this.totalHarga = totalHarga;
    }
    
    public int getIdTransaksi() {
        return idTransaksi;
    }

    public LocalDateTime getTanggalTransaksi() {
        return tanggalTransaksi;
    }
    
    public int getIdUser() {
        return idUser;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getDiskon() {
        return diskon;
    }

    public double getTotalHarga() {
        return totalHarga;
    }
    
}
