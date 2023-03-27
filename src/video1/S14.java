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
public class S14 {

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
        System.out.print("Chon vi tri cong viec muon update:");
        int viTiMuonXoa = sc.nextInt();
        System.out.print("Update noi dung cong viec :");
        String updateCongViec = sc.nextLine();
        listCongVien.set(viTiMuonXoa, updateCongViec);
        System.out.println("Sau khi update:");
        for (String str : listCongVien) {
            System.out.println(str);
        }
    }
}
