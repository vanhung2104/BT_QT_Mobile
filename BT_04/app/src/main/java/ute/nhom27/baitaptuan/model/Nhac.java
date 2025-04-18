package ute.nhom27.baitaptuan.model;

public class Nhac {
    public Nhac(String ma, String ten, String loi, String casi) {
        this.ma = ma;
        this.ten = ten;
        this.loi = loi;
        this.casi = casi;
    }

    String ma;
    String ten;
    String loi;
    String casi;

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoi() {
        return loi;
    }

    public void setLoi(String loi) {
        this.loi = loi;
    }


}
