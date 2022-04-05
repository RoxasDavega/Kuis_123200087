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
public class AndroidDev extends Dev implements Nilai{

    private double nilaiAkhir;
    public AndroidDev(String nama, String nik, double tesTulis, double tesCoding, double tesWawancara) {
        super(nama, nik, tesTulis, tesCoding, tesWawancara);
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    @Override //menghitung Nilai Akhir
    public void nilaiAkhir() {
        this.nilaiAkhir = ((super.getTesTulis() * 0.2) + (super.getTesCoding() * 0.50) + (super.getTesWawancara() * 0.3));
    } 
}
