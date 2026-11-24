package model;

public class Pembayaran {
    private int idPembayaran;
    private int idTransaksi;
    private String metodePembayaran;
    private double jumlahBayar;
    private double kembalian;
    
    public Pembayaran(int idPembayaran,
                        int idTransaksi,
                        String metodePembayaran,
                        double jumlahBayar,
                        double kembalian){
        this.idPembayaran = idPembayaran;
        this.idTransaksi = idTransaksi;
        this.metodePembayaran = metodePembayaran;
        this.jumlahBayar = jumlahBayar;
        this.kembalian = kembalian;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public double getKembalian() {
        return kembalian;
    }
}
