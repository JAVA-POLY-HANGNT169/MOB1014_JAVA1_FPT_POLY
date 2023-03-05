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

    public SinhVien inputSV() {
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
        return sinhVien;
    }

    public void hienThiDsachSV(ArrayList<SinhVien> listSV) {
        for (SinhVien sinhVien : listSV) {
            sinhVien.display();
        }
    }

    public ArrayList<SinhVien> sinhVienDTBCaoNhat(ArrayList<SinhVien> listSV) {
        SinhVien sv = listSV.get(0);
        ArrayList<SinhVien> listSVCoDTBCaoNhat = new ArrayList<>();
        double diemTBMax = sv.diemTrungBinh(sv.getDiemHoa(), sv.getDiemLy(), sv.getDiemToan());
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.diemTrungBinh(sinhVien.getDiemHoa(), sinhVien.getDiemLy(), sinhVien.getDiemToan()) > diemTBMax) {
                diemTBMax = sinhVien.diemTrungBinh(sinhVien.getDiemHoa(), sinhVien.getDiemLy(), sinhVien.getDiemToan());
            }
        }
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.diemTrungBinh(sinhVien.getDiemHoa(), sinhVien.getDiemLy(), sinhVien.getDiemToan()) == diemTBMax) {
                listSVCoDTBCaoNhat.add(sinhVien);
            }
        }
        return listSVCoDTBCaoNhat;
    }

    public ArrayList<SinhVien> timKiemSVTheoTen(ArrayList<SinhVien> listSV, String tenSV) {
        ArrayList<SinhVien> listSVTheoTen = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTen().contains(tenSV)) {
                listSVTheoTen.add(sinhVien);
            }
        }
        return listSVTheoTen;
    }

    public boolean xoaSV(ArrayList<SinhVien> listSV, String maSV) {
        boolean isRemove = false;
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMa().equals(maSV)) {
                isRemove = true;
                listSV.remove(listSV.get(i));
            }
        }
        return isRemove;
    }

    public ArrayList<SinhVien> timSvTheoKhoangTuoi(ArrayList<SinhVien> listSV, int tuoiMin, int tuoiMax) {
        ArrayList<SinhVien> listSVTheoTuoi = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTuoi() >= tuoiMin && sinhVien.getTuoi() <= tuoiMax) {
                listSVTheoTuoi.add(sinhVien);
            }
        }
        return listSVTheoTuoi;
    }

    public NhanVien keThua() {
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
        return new NhanVien(luongTheoNgay, ma, ten, tuoi, gioiTinh, queQuan);
    }
}
