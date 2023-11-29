/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1.exception;

/**
 *
 * @author Wendy
 */
public class Barang {
    int kd_barang;
    String nama_barang;
    String gudang;
    int hrg_beli;
    int hrg_jual;

    public Barang(int kd_barang, String nama_barang, String gudang, int hrg_beli, int hrg_jual, int jlh_barang) throws ProgramException {
        if(hrg_jual < 1){
            throw new ProgramException("Error! Harga jual harus diatas angka 0.");
        }
        else if(jlh_barang < 1){
            throw new ProgramException("Error! Minimal jumlah barang yang dibeli adalah 1 unit.");
        }
        else{
            this.kd_barang = kd_barang;
            this.nama_barang = nama_barang;
            this.gudang = gudang;
            this.hrg_beli = hrg_beli * jlh_barang;
            this.hrg_jual = hrg_jual * jlh_barang;
        }
    }
}
