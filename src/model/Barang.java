package model;

public class Barang {
    private int idBarang;
    private String kodeBarang;
    private String namaBarang;
    private int idKategori;
    private double harga;
    private int stok;
    
    public Barang(int idBarang,
                String kodeBarang,
                String namaBarang,
                int idKategori,
                double harga,
                int stok){
        this.idBarang = idBarang;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.idKategori = idKategori;
        this.harga = harga;
        this.stok = stok;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
