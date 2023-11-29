/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan1.exception;

/**
 *
 * @author Wendy
 */
public class Latihan1Exception {

    public static void main(String[] args) {
        try{
            Barang barang1 = new Barang(100, "Sendok", "Gudang 1", 5000, 7000, 2);
            Barang barang2 = new Barang(200, "Garpu", "Gudang 1", 5500, 7500, 1);

            Keranjang keranjang1 = new Keranjang("Keranjang 1");
            keranjang1.tambahBarang(barang1);
            keranjang1.tambahBarang(barang2);

            keranjang1.listBarang();
        }
        catch(ProgramException e){
            System.out.println(e.getMessage());
        }
        
    }
}
