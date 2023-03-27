/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class S15_P2 {

    public static void main(String[] args) {
        System.out.println("1.Liet ke cac cong viec");
        System.out.println("2.Them cong viec");
        System.out.println("3.Xoa cong viec");
        System.out.println("4.Update cong viec");
        System.out.println("0.Thoat");
        ArrayList<String> listCongVien = new ArrayList<>();
        listCongVien.add("Nau com");
        listCongVien.add("Rua bat");
        listCongVien.add("Quet nha");
        Scanner sc = new Scanner(System.in);
        int chucNang = 0;
        do {
            System.out.println("Moi nhap chuc nang:");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1: {
                    for (String str : listCongVien) {
                        System.out.println(str);
                    }
                    break;
                }
                case 2: {
                    System.out.print("Nhap them cong viec moi:");
                    String congViecMoi = sc.nextLine();
                    listCongVien.add(congViecMoi);
                    System.out.println("Them thanh cong");
                    break;
                }
                case 3: {
                    System.out.print("Chon vi tri cong viec muon xoa:");
                    int viTiMuonXoa = sc.nextInt();
                    listCongVien.remove(viTiMuonXoa);
                    System.out.println("Xoa thanh cong");
                    break;
                }
                case 4: {
                    System.out.print("Chon vi tri cong viec muon update:");
                    int viTiMuonXoa = sc.nextInt();
                    System.out.print("Update noi dung cong viec :");
                    String updateCongViec = sc.nextLine();
                    listCongVien.set(viTiMuonXoa, updateCongViec);
                    System.out.println("Update thanh cong");
                    break;
                }
                case 0: {
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
