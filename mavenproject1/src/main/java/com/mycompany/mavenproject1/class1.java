/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author A-9
 */
public class class1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan data
        System.out.print("Masukkan sebuah bilangan bulat: ");
        
        // Membaca bilangan bulat yang dimasukkan oleh pengguna
        int bilangan = scanner.nextInt();
        
        // Menampilkan bilangan yang dimasukkan oleh pengguna
        System.out.println("Anda memasukkan bilangan: " + bilangan);
        
        // Menutup objek Scanner setelah penggunaan selesai
        scanner.close();
    }
}
