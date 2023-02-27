/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HangNT
 */
public class SinhVien extends Nguoi {

    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private String kyHoc;
    private String nganhHoc;

    public SinhVien() {
    }

    public SinhVien(double diemToan, double diemLy, double diemHoa, String kyHoc, String nganhHoc) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.kyHoc = kyHoc;
        this.nganhHoc = nganhHoc;
    }

    public SinhVien(double diemToan, double diemLy, double diemHoa, String kyHoc, String nganhHoc, String ma, String ten, int tuoi, int gioiTinh, String queQuan) {
        super(ma, ten, tuoi, gioiTinh, queQuan);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.kyHoc = kyHoc;
        this.nganhHoc = nganhHoc;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public String getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(String kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double diemTrungBinh(double diemToan, double diemLy, double diemHoa) {
        return (diemHoa + diemLy + diemToan) / 3;
    }
}
