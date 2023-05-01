package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chucNang = 0;
        ArrayList<DongVat> lists = new ArrayList<>();
        QuanLyDongVat quanLyDongVat = new QuanLyDongVat();
        do {
            System.out.println("1.Nhap vao dong vat");
            System.out.println("2.Xuat danh sach");
            System.out.println("3.Sap xep tang dan theo ten");
            System.out.println("4.Sap xep giam dan theo can nang");
            System.out.println("5.Xoa theo ma");
            System.out.println("6. Ke thua");
            System.out.println("0.Thoat ");
            System.out.print("Moi nhap chuc nang: ");
            chucNang = Integer.valueOf(scanner.nextLine());
            switch (chucNang) {
                case 1: {
                    quanLyDongVat.nhapThongTin(lists);
                    break;
                }
                case 2: {
                    quanLyDongVat.xuatThongTin(lists);
                    break;
                }
                case 3: {
                    quanLyDongVat.sapXepTangDanTheoTen(lists);
                    System.out.println("Sau khi sap xep ");
                    quanLyDongVat.xuatThongTin(lists);
                    break;
                }
                case 4: {
                    quanLyDongVat.sapXepGiamDanTheoCanNang(lists);
                    System.out.println("Sau khi sap xep ");
                    quanLyDongVat.xuatThongTin(lists);
                    break;
                }
                case 5: {
                    System.out.print("Moi nhap ma muon xoa");
                    String ma = scanner.nextLine();
                    quanLyDongVat.xoaTheoMa(lists, ma);
                    System.out.println("Sau khi xoa:");
                    quanLyDongVat.xuatThongTin(lists);
                    break;
                }
                case 6: {
                    quanLyDongVat.keThua();
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai ");
                    break;
                }
            }
        } while (chucNang != 0);
    }

}
