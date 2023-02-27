/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HangNT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> listSV = new ArrayList<>();
        int luaChon;
        QuanLySinhVien qlsv = new QuanLySinhVien();
        do {
            System.out.println("+----------Menu----------+");
            System.out.println("    1.Them SV");
            System.out.println("    2.Hien thi Dsach SV");
            System.out.println("    3.Tim kiem SV co DTB lon nhat");
            System.out.println("    4.Tim kiem SV theo ten");
            System.out.println("    5.Xoa SV theo ma");
            System.out.println("    6.Tim SV co theo khoang do tuoi");
            System.out.println("    7.Ke thua");
            System.out.println("    0.Thoat");
            System.out.println("+-------------------------+");
            System.out.print("Moi chon: ");
            luaChon = Integer.valueOf(sc.nextLine());
            switch (luaChon) {
                case 1: {
                    String tiepTuc = "";
                    do {
                        listSV.add(qlsv.inputSV());
                        System.out.println("Them 1 sinh vien?");
                        System.out.println("Vui long nhap Y (YES) or N(NO)");
                        tiepTuc = sc.nextLine();
                    } while (tiepTuc.equalsIgnoreCase("Y"));
                    break;
                }
                case 2: {
                    System.out.println("+----------------Danh sach sinh vien----------------+");
                    qlsv.hienThiDsachSV(listSV);
                    break;
                }
                case 3: {
                    List<SinhVien> listDiemCao = qlsv.sinhVienDTBCaoNhat(listSV);
                    qlsv.hienThiDsachSV(listDiemCao);
                    break;
                }
                case 4: {
                    System.out.println("Nhap ten SV can tim: ");
                    String tenSV = sc.nextLine();
                    List<SinhVien> listTheoTen = qlsv.timKiemSVTheoTen(listSV, tenSV);
                    if (listTheoTen.size() > 0) {
                        qlsv.hienThiDsachSV(listTheoTen);
                    } else {
                        System.out.println("Khong tim thay sinh vien nao co ten " + tenSV);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Nhap ma SV can xoa: ");
                    String maSV = sc.nextLine();
                    if (qlsv.xoaSV(listSV, maSV)) {
                        System.out.println("Xoa thanh cong");
                    } else {
                        System.out.println("Khong tim thay sinh vien co ma " + maSV);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Nhap tuoi min: ");
                    int tuoiMin = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap tuoi max: ");
                    int tuoiMax = Integer.valueOf(sc.nextLine());
                    List<SinhVien> listSVTheoTuoi = qlsv.timSvTheoKhoangTuoi(listSV, tuoiMin, tuoiMax);
                    if (listSVTheoTuoi.size() > 0) {
                        System.out.println("Dsach sv co do tuoi tu " + tuoiMin + " - " + tuoiMax + ":");
                        qlsv.hienThiDsachSV(listSVTheoTuoi);
                    } else {
                        System.out.println("Khong co sinh vien nao co do tuoi tu " + tuoiMin + " - " + tuoiMax);
                    }
                    break;
                }
                case 7: {
                    qlsv.keThua();
                    break;
                }
                case 0: {
                    System.out.println("Tam biet!");
                    break;
                }
                default: {
                    System.out.println("Ban da nhap lua chon khong ton tai");
                    break;
                }
            }
        } while (luaChon != 0);
    }

}
