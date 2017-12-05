package com.example.sherly.pesantriat.model;

/**
 * Created by sherly on 13/11/2017.
 */

public class DataDokter {

    private String nama, poli, jk, tgl_lahir;

    public DataDokter(String nama, String poli, String jk, String tgl_lahir) {
        this.nama = nama;
        this.poli = poli;
        this.jk = jk;
        this.tgl_lahir = tgl_lahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPoli() {
        return poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
}
