package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul3;



public class menulist {
    //membuat tipe data
    int gambar;
    String nama;
    String desc;

    //method setter
    public menulist(int gambar, String nama, String desc){
        this.gambar=gambar;
        this.nama=nama;
        this.desc=desc;
    }

    //method untuk mengambil gambar
    public int getGambar() {
        return gambar;
    }

    //method untuk mengambil nama
    public String getNama() {
        return nama;
    }

    //method untuk mengambil detail
    public String getDesc() {
        return desc;
    }

}


