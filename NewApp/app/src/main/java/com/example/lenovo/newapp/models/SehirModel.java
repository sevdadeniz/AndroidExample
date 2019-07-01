package com.example.lenovo.newapp.models;

public class SehirModel {

    int resim;
    String isim;
    String aciklama;

    public SehirModel(int resim, String isim, String aciklama) {
        this.resim = resim;
        this.isim = isim;
        this.aciklama = aciklama;
    }

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
