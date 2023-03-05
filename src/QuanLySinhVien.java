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
public class QuanLySinhVien {

    public void inputSV(ArrayList<SinhVien> listSV) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gioi tinh: 0.Nam - 1.Nu ");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap que quan: ");
        String queQuan = sc.nextLine();
        System.out.println("Nhap diem toan: ");
        double diemToan = Double.valueOf(sc.nextLine());
        System.out.println("Nhap diem ly: ");
        double diemLy = Double.valueOf(sc.nextLine());
        System.out.println("Nhap diem hoa: ");
        double diemHoa = Double.valueOf(sc.nextLine());
        System.out.println("Nhap ky hoc: ");
        String kyHoc = sc.nextLine();
        System.out.println("Nhap nganh hocc: ");
        String nganhHoc = sc.nextLine();
        SinhVien sinhVien = new SinhVien(diemToan, diemLy, diemHoa, kyHoc, nganhHoc, ma, ten, tuoi, gioiTinh, queQuan);
        listSV.add(sinhVien);
    }

    public void hienThiDsachSV(ArrayList<SinhVien> listSV) {
        System.out.println("+----------------Danh sach sinh vien----------------+");
        for (SinhVien sinhVien : listSV) {
            sinhVien.display();
        }
    }

    public void sinhVienDTBCaoNhat(ArrayList<SinhVien> listSV) {
        SinhVien sv = listSV.get(0);
        double diemTBMax = sv.diemTrungBinh(sv.getDiemHoa(), sv.getDiemLy(), sv.getDiemToan());
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.diemTrungBinh(sinhVien.getDiemHoa(), sinhVien.getDiemLy(), sinhVien.getDiemToan()) > diemTBMax) {
                diemTBMax = sinhVien.diemTrungBinh(sinhVien.getDiemHoa(), sinhVien.getDiemLy(), sinhVien.getDiemToan());
            }
        }
        System.out.println("Sinh vien co DTB cao nhat: ");
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.diemTrungBinh(sinhVien.getDiemHoa(), sinhVien.getDiemLy(), sinhVien.getDiemToan()) == diemTBMax) {
                sinhVien.display();

            }
        }
    }

    public void timKiemSVTheoTen(ArrayList<SinhVien> listSV, String tenSV) {
        ArrayList<SinhVien> listSVTheoTen = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTen().contains(tenSV)) {
                listSVTheoTen.add(sinhVien);
            }
        }
        if (listSVTheoTen.isEmpty()) {
            hienThiDsachSV(listSVTheoTen);
        } else {
            System.out.println("Khong tim thay sinh vien nao!");
        }
    }

    public void xoaSV(ArrayList<SinhVien> listSV, String maSV) {
        int dem = 0;
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMa().equals(maSV)) {
                dem++;
                listSV.remove(listSV.get(i));
            }
        }
        if (dem == 0) {
            System.out.println("Khong tim thay sinh vien co ma " + maSV);
        } else {
            System.out.println("Xoa thanh cong!");
        }
    }

    public void timSvTheoKhoangTuoi(ArrayList<SinhVien> listSV, int tuoiMin, int tuoiMax) {
        ArrayList<SinhVien> listSVTheoTuoi = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTuoi() >= tuoiMin && sinhVien.getTuoi() <= tuoiMax) {
                listSVTheoTuoi.add(sinhVien);
            }
        }
        if (listSVTheoTuoi.isEmpty()) {
            hienThiDsachSV(listSVTheoTuoi);
        } else {
            System.out.println("Khong co sv nao trong do tuoi " + tuoiMin + " - " + tuoiMax);
        }
    }

    public void keThua() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gioi tinh: 0.Nam - 1.Nu ");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap que quan: ");
        String queQuan = sc.nextLine();
        System.out.println("Nhap luong theo ngay: ");
        double luongTheoNgay = Double.valueOf(sc.nextLine());
        NhanVien nhanVien = new NhanVien(luongTheoNgay, ma, ten, tuoi, gioiTinh, queQuan);
        nhanVien.display();
    }
}
