package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class QuanLyDongVat {

    public void nhapThongTin(ArrayList<DongVat> lists) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap ma:");
        String ma = scanner.nextLine();
        System.out.print("Moi nhap ten:");
        String ten = scanner.nextLine();
        System.out.print("Moi nhap gioi tinh(true-Duc, false-Cai):");
        String gioiTinh = scanner.nextLine();
        System.out.print("Moi nhap can nang:");
        String canNang = scanner.nextLine();
        System.out.print("Moi nhap khu vuc song:");
        String khuVucSong = scanner.nextLine();
        System.out.print("Moi nhap nam sinh:");
        String namSinh = scanner.nextLine();
        DongVat dongVat = new DongVat(ma, ten, Boolean.valueOf(gioiTinh),
                Integer.valueOf(canNang), khuVucSong, Integer.valueOf(namSinh));
        lists.add(dongVat);
    }

    public void xuatThongTin(ArrayList<DongVat> lists) {
        lists.forEach(s -> s.inThongTin());
    }

    public void sapXepTangDanTheoTen(ArrayList<DongVat> lists) {
        lists.sort((o1, o2) -> {
            return o1.getTenDongVat().compareTo(o2.getTenDongVat());
        });
    }

    public void sapXepGiamDanTheoCanNang(ArrayList<DongVat> lists) {
        lists.sort((o1, o2) -> {
            return o2.getCanNang() - o1.getCanNang();
        });
    }

    public void xoaTheoMa(ArrayList<DongVat> lists, String maDongVat) {
        for (DongVat dongVat : lists) {
            if (dongVat.getMaDongVat().equalsIgnoreCase(maDongVat)) {
                lists.remove(dongVat);
                break;
            }
        }
    }

    public void keThua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap ma:");
        String ma = scanner.nextLine();
        System.out.print("Moi nhap ten:");
        String ten = scanner.nextLine();
        System.out.print("Moi nhap gioi tinh(true-Duc, false-Cai):");
        String gioiTinh = scanner.nextLine();
        System.out.print("Moi nhap can nang:");
        String canNang = scanner.nextLine();
        System.out.print("Moi nhap khu vuc song:");
        String khuVucSong = scanner.nextLine();
        System.out.print("Moi nhap nam sinh:");
        String namSinh = scanner.nextLine();
        System.out.print("Moi nhap loai thuc an yeu thich:");
        String loaiThucAnYeuThich = scanner.nextLine();
        Meo meo = new Meo(loaiThucAnYeuThich, ma, ten, Boolean.valueOf(gioiTinh),
                Integer.valueOf(canNang), khuVucSong, Integer.valueOf(namSinh));
        meo.inThongTin();
    }
}
