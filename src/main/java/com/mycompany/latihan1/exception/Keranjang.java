package com.mycompany.latihan1.exception;

public class Keranjang {
    String namaKeranjang;
    Barang listBarang[] = {};

    public Keranjang(String namaKeranjang) {
        this.namaKeranjang = namaKeranjang;
    }

    public void tambahBarang(Barang barang){
        int i;

        Barang newListBarang[] = new Barang[this.listBarang.length + 1];
 
        for (i = 0; i < this.listBarang.length; i++)
            newListBarang[i] = this.listBarang[i];
 
        newListBarang[this.listBarang.length] = barang;
        listBarang = newListBarang;
    }

    public void listBarang(){
        int i;

        for (i = 0; i < this.listBarang.length; i++){
            System.out.println("\n==================================================");
            System.out.println("Kode barang     : " + listBarang[i].kd_barang);
            System.out.println("Nama barang     : " + listBarang[i].nama_barang);
            System.out.println("Gudang barang   : " + listBarang[i].gudang);
            System.out.println("Harga beli      : " + listBarang[i].hrg_beli);
            System.out.println("Harga jual      : " + listBarang[i].hrg_jual);
            System.out.println("==================================================");
        }
    }
}
