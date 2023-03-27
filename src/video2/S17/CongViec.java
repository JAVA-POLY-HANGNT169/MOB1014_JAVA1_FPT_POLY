/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video2.S17;

/**
 *
 * @author hangnt
 */
public class CongViec {

    private String tenCongViec;
    private String tenTheLoai;
    private String trangThai;
//Thêm thông tin trạng thái đã, đang, chưa thực hiện công việc bằng String

    public CongViec() {
    }

    public CongViec(String tenCongViec, String tenTheLoai, String trangThai) {
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "CongViec{" + "tenCongViec=" + tenCongViec + ", tenTheLoai=" + tenTheLoai + ", trangThai=" + trangThai + '}';
    }

}
