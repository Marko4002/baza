package com.example.baza;

public class kandidat {
    private int idkandidat;
    private String ime;

    private String tel;
    public kandidat(){

    }
    public kandidat(int idkandidat, String ime, String tel){
        this.idkandidat=idkandidat;
        this.ime=ime;
        this.tel=tel;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    public int getIdkandidat() {
        return idkandidat;
    }

    public void setIdkandidat(int idkandidat) {
        this.idkandidat = idkandidat;
    }
}
