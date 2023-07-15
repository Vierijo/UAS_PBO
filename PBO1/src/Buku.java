/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER PC
 */
public class Buku {
   String judul, penulis, penerbit;
   double harga; 
   int halaman;
   
   void cetakInfo(){
        System.out.println("=========================");
        System.out.println("Judul Buku : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Jumlah Halaman : " + halaman + " Halaman");
        System.out.println("Harga : Rp." + harga);
        System.out.println("=========================");
    }
}
