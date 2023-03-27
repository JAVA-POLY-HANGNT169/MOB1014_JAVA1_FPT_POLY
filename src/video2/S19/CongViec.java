/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video2.S19;

/**
 *
 * @author hangnt
 */
public class CongViec {

    private String tenCongViec;
    private String tenTheLoai;
    private TrangThai trangThai;

    public CongViec() {
    }

    public CongViec(String tenCongViec, String tenTheLoai, TrangThai trangThai) {
        this.tenCongViec = tenCongViec;
        this.tenTheLoai = tenTheLoai;
        this.trangThai = trangThai;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "CongViec{" + "tenCongViec=" + tenCongViec + ", tenTheLoai=" + tenTheLoai + ", trangThai=" + trangThai + '}';
    }

}
