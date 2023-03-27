/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video2.S16;

/**
 *
 * @author hangnt
 */
public class CongViec {

    private String tenCongViec;
    private String tenTheLoai;

    public CongViec() {
    }

    public CongViec(String tenCongViec, String tenTheLoai) {
        this.tenCongViec = tenCongViec;
        this.tenTheLoai = tenTheLoai;
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

    @Override
    public String toString() {
        return "CongViec{" + "tenCongViec=" + tenCongViec + ", tenTheLoai=" + tenTheLoai + '}';
    }

}
