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
public class S13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listCongVien = new ArrayList<>();
        listCongVien.add("Nau com");
        listCongVien.add("Rua bat");
        listCongVien.add("Quet nha");
        System.out.println("Các công việc hiện tại:");
        for (String str : listCongVien) {
            System.out.println(str);
        }
        System.out.print("Chon vi tri cong viec muon xoa:");
        int viTiMuonXoa = sc.nextInt();
        listCongVien.remove(viTiMuonXoa);
        System.out.println("Sau khi xoa:");
        for (String str : listCongVien) {
            System.out.println(str);
        }
    }
}
