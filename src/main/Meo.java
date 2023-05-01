/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author hangnt
 */
public class Meo extends DongVat {

    private String loaiThucAnYeuThich;

    public Meo() {
    }

    public Meo(String loaiThucAnYeuThich, String maDongVat, String tenDongVat, Boolean gioiTinh, Integer canNang, String khuVucSong, Integer namSinh) {
        super(maDongVat, tenDongVat, gioiTinh, canNang, khuVucSong, namSinh);
        this.loaiThucAnYeuThich = loaiThucAnYeuThich;
    }

    public String getLoaiThucAnYeuThich() {
        return loaiThucAnYeuThich;
    }

    public void setLoaiThucAnYeuThich(String loaiThucAnYeuThich) {
        this.loaiThucAnYeuThich = loaiThucAnYeuThich;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Loa thuc an yeu thich: " + loaiThucAnYeuThich);
    }
    
}
