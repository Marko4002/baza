package com.example.baza;

public class kvallifikacija {
    private int idkvalifikacija;
    private String naziv;
    public kvallifikacija(int idkvalifikacija, String naziv){
        this.idkvalifikacija=idkvalifikacija;
        this.naziv=naziv;
    }

    public int getIdkvalifikacija() {
        return idkvalifikacija;
    }

    public void setIdkvalifikacija(int idkvalifikacija) {
        this.idkvalifikacija = idkvalifikacija;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
