/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author HangNT
 */
public class QuanLySinhVien {

    Scanner sc = new Scanner(System.in);

    public SinhVien inputSV() {
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

    public void hienThiDsachSV(List<SinhVien> listSV) {
        for (SinhVien sinhVien : listSV) {
            System.out.println("Ma: " + sinhVien.getMa());
            System.out.println("Ten: " + sinhVien.getTen());
            System.out.println("Tuoi: " + sinhVien.getTuoi());
            if (sinhVien.getGioiTinh() == 0) {
                System.out.println("Gioi tinh: Nam");
            } else {
                System.out.println("Gioi tinh: Nu");
            }
            System.out.println("Que quan: " + sinhVien.getQueQuan());
            System.out.println("Ky hoc: " + sinhVien.getKyHoc());
            System.out.println("Nganh hoc: " + sinhVien.getNganhHoc());
            System.out.println("Diem trung binh: " + sinhVien.diemTrungBinh(sinhVien.getDiemHoa(), sinhVien.getDiemLy(), sinhVien.getDiemToan()));
            System.out.println("");
        }
    }

    public List<SinhVien> sinhVienDTBCaoNhat(List<SinhVien> listSV) {
        SinhVien sv = listSV.get(0);
        List<SinhVien> listSVCoDTBCaoNhat = new ArrayList<>();
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

    public List<SinhVien> timKiemSVTheoTen(List<SinhVien> listSV, String tenSV) {
        List<SinhVien> listSVTheoTen = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTen().contains(tenSV)) {
                listSVTheoTen.add(sinhVien);
            }
        }
        return listSVTheoTen;
    }

    public boolean xoaSV(List<SinhVien> listSV, String maSV) {
        boolean isRemove = false;
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMa().equals(maSV)) {
                isRemove = true;
                listSV.remove(listSV.get(i));
            }
        }
        return isRemove;
    }

    public List<SinhVien> timSvTheoKhoangTuoi(List<SinhVien> listSV, int tuoiMin, int tuoiMax) {
        List<SinhVien> listSVTheoTuoi = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTuoi() >= tuoiMin && sinhVien.getTuoi() <= tuoiMax) {
                listSVTheoTuoi.add(sinhVien);
            }
        }
        return listSVTheoTuoi;
    }

    public void keThua() {
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
        System.out.println("Thong tin nhan vien vua nhap: ");
        System.out.println("Ma: " + nhanVien.getMa());
        System.out.println("Ten: " + nhanVien.getTen());
        System.out.println("Tuoi: " + nhanVien.getTuoi());
        if (nhanVien.getGioiTinh() == 0) {
            System.out.println("Gioi tinh: Nam");
        } else {
            System.out.println("Gioi tinh: Nu");
        }
        System.out.println("Que quan: " + nhanVien.getQueQuan());
        System.out.println("Luong theo ngay: " + nhanVien.getLuongTheoNgay());
        System.out.println("");
    }
}
