package model;

public class DetailPengembalian {
    private int idDetailPengembalian;
    private int idPengembalian;
    private int idDetail;
    private int jumlah;
    private double subTotal;
    
    public DetailPengembalian(int idDetailPengembalian,
                                int idPengembalian,
                                int idDetail,
                                int jumlah,    
                                double subTotal){
        this.idDetailPengembalian = idDetailPengembalian;
        this.idPengembalian = idPengembalian;
        this.idDetail = idDetail;
        this.jumlah = jumlah;
        this.subTotal = subTotal;
    }

    public int getIdDetailPengembalian() {
        return idDetailPengembalian;
    }

    public int getIdPengembalian() {
        return idPengembalian;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubTotal() {
        return subTotal;
    }
}
