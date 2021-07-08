package com.example.testfirebase;


import java.io.Serializable;

public class Barang implements Serializable {

    private String nama;
    private String usia;
    private String alamat;
    private String key;


    public Barang() {

    }


public String getKey() {
    return key;
    }


    public void setKey(String key) {
        this.key = key;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return " "+nama+"\n" +
                " "+usia +"\n" +
                " "+usia;
    }

    public Barang(String nm, String us, String alm){
        nama = nm;
        usia = us;
        alamat = alm;
    }




}
