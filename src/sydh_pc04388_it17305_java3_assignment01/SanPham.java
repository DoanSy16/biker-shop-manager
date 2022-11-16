/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sydh_pc04388_it17305_java3_assignment01;

import java.io.Serializable;

/**
 *
 * @author Đoàn Hiệp Sỹ
 */
public class SanPham implements Serializable {
    private String MSX,ten,hangXe,phanKhoi,soKhung,soMay,mauSon,anh,noiSanxuat,loaiXe,maHang;
    private int choNgoi; 
    private double gia;

    public SanPham() {
    }

    public SanPham(String MSX, String ten, String hangXe, String phanKhoi, String soKhung, String soMay, String mauSon, String anh, String noiSanxuat, String loaiXe, int choNgoi, double gia, String maHang) {
        this.MSX = MSX;
        this.ten = ten;
        this.hangXe = hangXe;
        this.phanKhoi = phanKhoi;
        this.soKhung = soKhung;
        this.soMay = soMay;
        this.mauSon = mauSon;
        this.anh = anh;
        this.noiSanxuat = noiSanxuat;
        this.loaiXe = loaiXe;
        this.choNgoi = choNgoi;
        this.gia = gia;
        this.maHang = maHang;
        
    }

    

    public String getMSX() {
        return MSX;
    }

    public void setMSX(String MSX) {
        this.MSX = MSX;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(String phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    public String getSoKhung() {
        return soKhung;
    }

    public void setSoKhung(String soKhung) {
        this.soKhung = soKhung;
    }

    public String getSoMay() {
        return soMay;
    }

    public void setSoMay(String soMay) {
        this.soMay = soMay;
    }

    public String getMauSon() {
        return mauSon;
    }

    public void setMauSon(String mauSon) {
        this.mauSon = mauSon;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getNoiSanxuat() {
        return noiSanxuat;
    }

    public void setNoiSanxuat(String noiSanxuat) {
        this.noiSanxuat = noiSanxuat;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

  
    


    
    }
