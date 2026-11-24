package model;

public class DetailTransaksi {
    private int idDetail;
    private int idTransaksi;
    private int idBarang;
    private int jumlah;
    private double hargaSatuan;
    private double subTotal;
    
    public DetailTransaksi(int idDetail,
                            int idTransaksi,
                            int idBarang,
                            int jumlah, 
                            double hargaSatuan,
                            double subTotal){
        this.idDetail = idDetail;
        this.idTransaksi = idTransaksi;
        this.idBarang = idBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.subTotal =subTotal;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public double getSubTotal() {
        return subTotal;
    }
}
