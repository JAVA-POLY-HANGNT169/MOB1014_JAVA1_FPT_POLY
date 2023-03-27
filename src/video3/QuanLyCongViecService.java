/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video3;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class QuanLyCongViecService {

    // Viet Tat ca noi dung cac ham logic o trong class Service 
    // 5 ham 
    // Ham Nhap
    public void nhapCongViec(ArrayList<CongViec> lists) throws ParseException {
        // Ten Cong Viec, Ten The Loai, Trang Thai, Thoi Gian Hoan Thanh 
        // B1: Nhap tu ban phim cac thuoc tinh
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cong viec:");
        String tenCongViec = sc.nextLine();
        System.out.print("Nhap ten the loai:");
        String tenTheLoai = sc.nextLine();
        // Trang Thai => Chua Thuc Hien 
        System.out.print("Thoi gian hoan thanh:");
        String thoiGianHoanThanh = sc.nextLine();
        // Convent String => Long 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(thoiGianHoanThanh);

        // B2: Tao 1 doi tuong 
        CongViec cv = new CongViec(tenCongViec, tenTheLoai, TrangThai.CHUA_THUC_HIEN, date.getTime());

        // B3: Add vao list
        lists.add(cv);
    }

    // Xem Cong Viec Chua Thuc Hien 
    public void xemCongViecChuaThucHien(ArrayList<CongViec> lists) {
        for (CongViec cv : lists) {
            if (cv.getTrangThai().equals(TrangThai.CHUA_THUC_HIEN)) {
                cv.inThongTin();
            }
        }
    }

    // Xem cong viec gan Deadline 
    public void xemCongViecGanDeadline(ArrayList<CongViec> lists) {
        // ngay hien tai - ngay can hoan thanh 3 ngay => Bao CV gan den deadline 
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        for (CongViec cv : lists) {
            Date date = new Date(new Timestamp(cv.getThoiGianHoanThanh()).getTime());
            // Thoi Gian Hoan Thanh
            c1.setTime(date);
            // Thoi Gian Hien Tai
            c2.setTime(new Date());

            // Cong thuc tinh so ngay giua 2 moc thoi gian 
            long noDay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
            if (cv.getTrangThai() != TrangThai.DA_THUC_HIEN && noDay < 3) {
                cv.inThongTin();
            }
        }
    }

    // Xoa Cong Viec 
    public void xoaCongViec(ArrayList<CongViec> lists, int index) {
        lists.remove(index);
    }

    // Update Cong Viec 
    public void capNhapCongViec(ArrayList<CongViec> lists, int index) {
        // B1: Lay ra doi tuong ma muon update 
        CongViec cv = lists.get(index);
        // B2: Nhap  Trang Thai moi  Cong Viec 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap trang thai cong viec: "
                + "0- Chua Thuc Hien, 1- Dang Thuc Hien, 2- Da Thuc HIen:");
        Integer indexTrangThai = Integer.valueOf(sc.nextLine());
        // B3: Thay doi trang thai cong Viec 
        cv.setTrangThai(TrangThai.values()[indexTrangThai]);
        // B4: Update vao list 
        lists.set(index, cv);
    }

}
