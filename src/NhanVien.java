/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HangNT
 */
public class NhanVien extends Nguoi {

    private double luongTheoNgay;

    public NhanVien() {
    }

    public NhanVien(double luongTheoNgay) {
        this.luongTheoNgay = luongTheoNgay;
    }

    public NhanVien(double luongTheoNgay, String ma, String ten, int tuoi, int gioiTinh, String queQuan) {
        super(ma, ten, tuoi, gioiTinh, queQuan);
        this.luongTheoNgay = luongTheoNgay;
    }

    public double getLuongTheoNgay() {
        return luongTheoNgay;
    }

    public void setLuongTheoNgay(double luongTheoNgay) {
        this.luongTheoNgay = luongTheoNgay;
    }

    public void display() {
        super.display();
        System.out.println("Luong theo ngay:" + luongTheoNgay);
    }
}
