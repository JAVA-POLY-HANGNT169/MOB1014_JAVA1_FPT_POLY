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
    List<SinhVien> listSV = new ArrayList<>();

    public void inputSV() {
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

    public void hienThiDsachSV() {
        System.out.println("+----------------Danh sach sinh vien----------------+");
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

    public void sinhVienDTBCaoNhat() {
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
    }

    public void timKiemSVTheoTen() {
        System.out.println("Nhap ten SV can tim: ");
        String tenSV = sc.nextLine();
        List<SinhVien> listSVTheoTen = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTen().contains(tenSV)) {
                listSVTheoTen.add(sinhVien);
            }
        }
        if (listSVTheoTen.size() > 0) {
            System.out.println("--------ket qua tim kiem: ");
            for (SinhVien sinhVien : listSVTheoTen) {
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
        } else {
            System.out.println("Khong tim thay sinh vien nao!");
        }
    }

    public void xoaSV() {
        System.out.println("Nhap ma SV can xoa: ");
        String maSV = sc.nextLine();
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

    public void timSvTheoKhoangTuoi() {
        System.out.println("Nhap tuoi min: ");
        int tuoiMin = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap tuoi max: ");
        int tuoiMax = Integer.valueOf(sc.nextLine());
        List<SinhVien> listSVTheoTuoi = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTuoi() >= tuoiMin && sinhVien.getTuoi() <= tuoiMax) {
                listSVTheoTuoi.add(sinhVien);
            }
        }
        if (listSVTheoTuoi.size() > 0) {
            System.out.println("Sinh vien trong do tuoi: " + tuoiMin + " - " + tuoiMax + ":");
            for (SinhVien sinhVien : listSVTheoTuoi) {
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
        } else {
            System.out.println("Khong co sv nao trong do tuoi " + tuoiMin + " - " + tuoiMax);
        }
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
