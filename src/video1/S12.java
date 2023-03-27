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
public class S12 {

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
        System.out.print("Nhap them cong viec moi:");
        String congViecMoi = sc.nextLine();
        listCongVien.add(congViecMoi);
        System.out.println("Sau khi them:");
        for (String str : listCongVien) {
            System.out.println(str);
        }
    }
}
