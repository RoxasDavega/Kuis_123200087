/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Divisi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dev {
    private String nik, nama;
    private double tesTulis, tesCoding, tesWawancara;

    public Dev(String nama, String nik, double tesTulis, double tesCoding, double tesWawancara) {
        this.nama = nama;
        this.nik = nik;
        this.tesTulis = tesTulis;
        this.tesCoding = tesCoding;
        this.tesWawancara = tesWawancara;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public double getTesTulis() {
        return tesTulis;
    }

    public void setTesTulis(double tesTulis) {
        this.tesTulis = tesTulis;
    }

    public double getTesCoding() {
        return tesCoding;
    }

    public void setTesCoding(double tesCoding) {
        this.tesCoding = tesCoding;
    }

    public double getTesWawancara() {
        return tesWawancara;
    }

    public void setTesWawancara(double tesWawancara) {
        this.tesWawancara = tesWawancara;
    }

  
    
}
