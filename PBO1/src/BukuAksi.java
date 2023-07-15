/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER PC
 */
public class BukuAksi {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku();
        buku1.judul = "Siksaan Neraka";
        buku1.penulis = "Rahimsyah, MB & Ema Wardhana";
        buku1.penerbit = "Bintang Indonesia";
        buku1.halaman = 32;
        buku1.harga = 10500;
        
        buku1.cetakInfo();
      
    }
}
