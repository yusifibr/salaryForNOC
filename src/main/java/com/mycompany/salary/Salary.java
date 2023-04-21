/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salary;

import java.util.Scanner;

/**
 *
 * @author Yusif
 */
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("gunduz saatlarinizi daxil edin: ");
        int gun_saat = sc.nextInt();
        
        System.out.println("axsam saatlarinizi daxil edin: ");
        int axs_saat = sc.nextInt();
        
        System.out.println("gece saatlarinizi daxil edin: ");
        int gece_saat = sc.nextInt();
        
        
        System.out.println("istehsalat teqvimini daxil edin: ");
        double istehsalat_teqvimi = sc.nextDouble();        
        
        double oklad = 750.75;
        
        double gunduz = (gun_saat*oklad)/istehsalat_teqvimi;
        double axsham = (axs_saat*oklad)/istehsalat_teqvimi + (((axs_saat*oklad)/istehsalat_teqvimi)*20)/100;
        double gece = (gece_saat*oklad)/istehsalat_teqvimi + (((gece_saat*oklad)/istehsalat_teqvimi)*40)/100;
        double umumi = gunduz + axsham + gece;
        
        double dsmf = ((umumi-200)*10)/100 + (200*3)/100;
        double icbari_sigorta = (umumi*2)/100;
        double ishsizlik = (umumi*0.5)/100;
        
        double salary = umumi - dsmf - icbari_sigorta - ishsizlik;
        
        
        System.out.println("Sizin MAASINIZ: " + salary);
        
        
    }
}
