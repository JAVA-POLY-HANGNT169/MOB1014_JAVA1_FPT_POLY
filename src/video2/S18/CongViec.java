/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video2.S18;

/**
 *
 * @author hangnt
 */
public class CongViec {

    private String tenCongViec;
    private String tenTheLoai;
    private Integer trangThai;
    //Thêm thông tin trạng thái đã, đang, chưa thực hiện công việc bằng Integer

    public CongViec() {
    }

    public CongViec(String tenCongViec, String tenTheLoai, Integer trangThai) {
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

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "CongViec{" + "tenCongViec=" + tenCongViec + ", tenTheLoai=" + tenTheLoai + ", trangThai=" + trangThai + '}';
    }

}
