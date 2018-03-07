package com.example.asus.baitap;

/**
 * Created by Asus on 3/6/2018.
 */

public class Hoa {
    private String Ten;
    private String Giaban;
    private int Hinh;

    public Hoa(String ten, String giaban, int hinh) {
        Ten = ten;
        Giaban = giaban;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public String getGiaban() {
        return Giaban;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setGiaban(String giaban) {
        Giaban = giaban;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
