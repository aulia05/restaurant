/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auliaafifah_resto;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Auliaafifah_resto {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Scanner milih = new Scanner(System.in);
        Scanner t_makan = new Scanner(System.in);
        Scanner t_minum = new Scanner(System.in);
        Scanner h_makan = new Scanner(System.in);
        Scanner h_minum = new Scanner(System.in);
        
        
        //Membuat menu Mini Restaurant
         Stack<String> menu_makan = new Stack<>();
        Queue<String> menu_minum = new LinkedList<>();

        //Menu makanan Mini Restaurant
        menu_makan.push("Nasi ayam curry");
        menu_makan.push("Nasi ayam Telur asin");
        menu_makan.push("Ayam telur penyet");
        menu_makan.push("Nasi ayam + telur sambel matah");
        menu_makan.push("Ayam Geprek");
        menu_makan.push("Beef gyudon");
        menu_makan.push("Spaghetti carbonara");
        menu_makan.push("Spaghetti bolognaise");
        menu_makan.push("French fries");
        menu_makan.push("Otak - otak lumpia");
        menu_makan.push("Cireng");
        menu_makan.push("Potato wedges");
        menu_makan.push("Onion rings");
        menu_makan.push("Singkong keju");
        
        
        //Menu Minuman Mini Restaurant
        menu_minum.add("Lychee tea");
        menu_minum.add("Lemon Tea");
        menu_minum.add("Honey milk tea");
        menu_minum.add("Honey lime tea");
        menu_minum.add("Peach tea");
        menu_minum.add("Orange squash");
        menu_minum.add("Lemon squash");
        menu_minum.add("Blue moon");
        menu_minum.add("HOT/ICE Americano");
        menu_minum.add("HOT Espresso single");
        menu_minum.add("HOT/ICE Red velved");
        menu_minum.add("HOT Coffee latte");
        menu_minum.add("HOT/ICE Vanilla latte");
        menu_minum.add("HOT/ICE Caramel latte");
        menu_minum.add("HOT/ICE Mocca latte");
        menu_minum.add("HOT/ICE Hazelnut latte");
        menu_minum.add("ICE Kopi susu");
        menu_minum.add("ICE Cappucino");
        menu_minum.add("ICE Banana coffee");
        menu_minum.add("ICE Avocaddo espresso");

        //Mini Restaurant
        System.out.println("============================================");
        System.out.println("====WELCOME IN SENJA COFFEE====");
        System.out.println("============================================");
        System.out.println("1. Lihat Daftar Menu                       |");
        System.out.println("2. Lihat Daftar Menu Makanan               |");
        System.out.println("3. Lihat Daftar Menu Minuman               |");      
        System.out.println("4. Pilih Menu Sendiri                      |");
        System.out.println("============================================");
        System.out.println("");
        System.out.println("============================================");
        System.out.println("=====SENJA COFFEE (Tempat Bayar=====");
        System.out.println("============================================");
        System.out.println("5. Menambah Menu Makanan                   |");
        System.out.println("6. Menambah Menu Minuman                   |");
        System.out.println("7. Menghapus Menu Makanan                  |");
        System.out.println("8. Menghapus Menu Minuman                  |");
        System.out.println("9. Mengecek Makanan Pertama                |");
        System.out.println("10.Mengecek Minuman Pertama                |");
        System.out.println("============================================");
        
        System.out.print("Silahkan dipilih! : ");
                   String a = menu.nextLine();

        switch(a) {
            case "1":
                System.out.print("Makanan yang tersedia: ");
                System.out.println(menu_makan);
                System.out.println("");
                System.out.print("Minuman yang tersedia: ");
                System.out.println(menu_minum);
                break;
            case "2":
                System.out.print("Makanan yang tersedia: ");
                System.out.println(menu_makan);
                break;
            case "3":
                System.out.print("Minuman yang tersedia: ");
                System.out.println(menu_minum);
                break;
            case "4":
                System.out.print("Anda Pesan Apa?: ");
                String y = milih.nextLine();
                if(menu_makan.contains(y)){
                System.out.println("Pesanan anda sudah diterima \nMakanan sedang diproses... ");
                }
                else if(menu_minum.contains(y)){
                    System.out.println("Pesanan anda sudah diterima \nMinuman sedang diproses...");
                }
                else{
                    System.out.println("Mohon maaf untuk "+y+" sedang kosong");
                }
                break;
            case "5":
                System.out.println("Tidak bisa diakses kecuali Tempat Bayar");
                System.out.println("");
                System.out.print("Menu Makanan apa yang ingin anda tambah? ");
                String g = t_makan.nextLine();
                menu_makan.push(g);
                System.out.println("Success Bro !!");
                System.out.println(menu_makan);
                break;
            case "6":
                System.out.println("Tidak bisa diakses kecuali Kasir");
                System.out.println("");
                System.out.print("Menu Minuman apa yang mau ditambah? ");
                String h = t_minum.nextLine();
                menu_minum.add(h);
                System.out.println("");
                System.out.println("Success Bro !!");
                System.out.println(menu_minum);
                break;
            case "7":
                System.out.println("Tidak bisa diakses kecuali Kasir");
                System.out.println("");
                System.out.println(menu_makan);
                System.out.print("Menu Makanan apa yang mau dihapus? ");
                String i = h_makan.nextLine();
                menu_makan.remove(i);
                System.out.println("Makanan Berhasil dihapus!");
                System.out.println(menu_makan);
                break;
            case "8":
                System.out.println("Tidak bisa diakses kecuali Tempat Bayar");
                System.out.println("");
                System.out.println(menu_minum);
                System.out.print("Menu Minuman apa yang mau dihapus? ");
                String j = h_minum.nextLine();
                menu_minum.remove(j);
                System.out.println("Minuman Berhasil dihapus!");
                System.out.println(menu_minum);
                break;
           case "9":
                System.out.println("Tidak bisa diakses kecuali Kasir");
                System.out.println("");
                System.out.println("Cek Stok Makanan, yang paaling pertama adalah "+menu_makan.firstElement());
                System.out.println(menu_makan);
                break;
            case "10":
                System.out.println("Tidak bisa diakses kecuali Kasir");
                System.out.println("");
                System.out.println("Cek Stok Minuman, yang paaling pertama adalah "+menu_minum.peek());
                System.out.println(menu_minum);
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
}
}