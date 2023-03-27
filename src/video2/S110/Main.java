/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video2.S110;

import java.util.Date;
import video2.S19.TrangThai;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        CongViec cv = new CongViec("te1", "loai1", TrangThai.DangThucHien, new Date());
        System.out.println(cv.toString());
    }
}
