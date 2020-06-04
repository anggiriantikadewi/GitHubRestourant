/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anggi Riantika Dewi
 */
public class supplier {
    private String kodesupp;
    private String namasupp;
    private String alamat;
    private Double telepon;

    public String getKodesupp() {
        return kodesupp;
    }

    public void setKodesupp(String kodesupp) {
        this.kodesupp = kodesupp;
    }

    public String getNamasupp() {
        return namasupp;
    }

    public void setNamasupp(String namasupp) {
        this.namasupp = namasupp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Double getTelepon() {
        return telepon;
    }

    public void setTelepon(Double telepon) {
        this.telepon = telepon;
    }
    
}
