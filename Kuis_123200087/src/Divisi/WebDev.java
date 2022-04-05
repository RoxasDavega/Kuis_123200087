/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Divisi;

/**
 *
 * @author user
 */
public class WebDev extends Dev implements Nilai{

    private double nilaiAkhir;

    public WebDev(String nama, String nik, double tesTulis, double tesCoding, double tesWawancara) {
        super(nama, nik, tesTulis, tesCoding, tesWawancara);
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
    
    @Override //Menghitung Nilai Akhir
    public void nilaiAkhir() {
        this.nilaiAkhir = ((super.getTesTulis() * 0.4) + (super.getTesCoding() * 0.35) + (super.getTesWawancara() * 0.25));
    }
    
    
    
}
