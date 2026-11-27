package model;

import java.time.LocalDateTime;

public class Pengembalian {
    private int idPengembalian;
    private int idTransaksi;
    private LocalDateTime tanggalPengembalian;
    private double totalPengembalian;
    private String alasan;

    public Pengembalian(int idPengembalian,
                        int idTransaksi, 
                        LocalDateTime tanggalPengembalian,
                        double totalPengembalian,
                        String alasan){
        this.idPengembalian = idPengembalian;
        this.idTransaksi = idTransaksi;
        this.tanggalPengembalian = tanggalPengembalian;
        this.totalPengembalian = totalPengembalian;
        this.alasan = alasan;
    }
    
    public int getIdPengembalian() {
        return idPengembalian;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public LocalDateTime getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public double getTotalPengembalian() {
        return totalPengembalian;
    }

    public String getAlasan() {
        return alasan;
    }
}
