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
public class Nguoidung implements Serializable{
    private String userName,passWord;
    private int trangThai ;

    public Nguoidung() {
    }

    public Nguoidung(String userName, String passWord, int trangThai) {
        this.userName = userName;
        this.passWord = passWord;
        this.trangThai = trangThai;
    }

    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
