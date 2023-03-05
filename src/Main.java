/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HangNT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        QuanLySinhVien qlsv = new QuanLySinhVien();
        ArrayList<SinhVien> lists = new ArrayList<>();
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
                        qlsv.inputSV(lists);
                        System.out.println("Them 1 sinh vien?");
                        System.out.println("Vui long nhap Y (YES) or N(NO)");
                        tiepTuc = sc.nextLine();
                    } while (tiepTuc.equalsIgnoreCase("Y"));
                    break;
                }
                case 2: {
                    qlsv.hienThiDsachSV(lists);
                    break;
                }
                case 3: {
                    qlsv.sinhVienDTBCaoNhat(lists);
                    break;
                }
                case 4: {
                    System.out.print("Moi nhap: ");
                    String tenSearch = sc.nextLine();
                    qlsv.timKiemSVTheoTen(lists, tenSearch);
                    break;
                }
                case 5: {
                    System.out.print("Moi nhap: ");
                    String maXoa = sc.nextLine();
                    qlsv.xoaSV(lists, maXoa);
                    break;
                }
                case 6: {
                    System.out.print("Moi nhap tuoi max: ");
                    int tuoiMax = Integer.valueOf(sc.nextLine());
                    System.out.print("Moi nhap tuoi min: ");
                    int tuoiMin = Integer.valueOf(sc.nextLine());
                    qlsv.timSvTheoKhoangTuoi(lists, tuoiMax, tuoiMin);
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
