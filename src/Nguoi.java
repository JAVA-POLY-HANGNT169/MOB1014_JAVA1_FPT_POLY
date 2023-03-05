/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HangNT
 */
public class Nguoi {

    private String ma;
    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String ma, String ten, int tuoi, int gioiTinh, String queQuan) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void display() {
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        if (gioiTinh == 0) {
            System.out.println("Gioi tinh: Nam");
        } else {
            System.out.println("Gioi tinh: Nu");
        }
        System.out.println("Que quan: " + queQuan);
    }
}
