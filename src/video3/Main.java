/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<CongViec> listCongViec = new ArrayList<>();
        int chucNang;
        QuanLyCongViecService service = new QuanLyCongViecService();
        do {
            System.out.println("1.Nhap doi tuong cv moi");
            System.out.println("2.Xem cong viec chua thuc hien");
            System.out.println("3.Xem cong viec gan den deadline");
            System.out.println("4. Xoa cong viec");
            System.out.println("5.Cap nhap trang thai cong viec");
            System.out.println("0.Thoat");
            System.out.print("Moi nhap chuc nang:");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1: {
                    service.nhapCongViec(listCongViec);
                    break;
                }
                case 2: {
                    service.xemCongViecChuaThucHien(listCongViec);
                    break;
                }
                case 3: {
                    service.xemCongViecGanDeadline(listCongViec);
                    break;
                }
                case 4: {
                    System.out.print("Nhap vi tri muon xoa:");
                    int index = Integer.valueOf(sc.nextLine());
                    service.xoaCongViec(listCongViec, index);
                    break;
                }
                case 5: {
                    System.out.print("Nhap vi tri muon update:");
                    int index = Integer.valueOf(sc.nextLine());
                    service.capNhapCongViec(listCongViec, index);
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai");
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
