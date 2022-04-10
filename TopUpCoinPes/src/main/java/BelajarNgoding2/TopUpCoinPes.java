/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package BelajarNgoding2;

/**
 *
 * @author Acer
 */

import java.util.Scanner;
public class TopUpCoinPes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner masuk=new Scanner(System.in);
        int pilih;
        System.out.println("TOP COIN PES MY CLUB:");
        System.out.println("1.100 COIN");
        System.out.println("2.500 COIN");
        System.out.println("3.1000 COIN");
        System.out.println("MASUKAN PILIHAN NOMINAL COIN:");
        pilih=masuk.nextInt();
        if (pilih==1)
            System.out.println("harga 100 coin : 16 ribu");
        else if (pilih==2)
            System.out.println("harga 500 coin : 50 ribu");
        else if (pilih==3)
            System.out.println("harga 1000 coin : 100 ribu");
        else
            System.out.println("MAAF KODE SALAH, SILAHKAN COBA LAGI");
        for (int i=1; i>0; i--)
        {
            for (int j=1; j>0; j++)
            {
                System.out.println("apakah anda sudah yakin memilih ini?");
                System.out.println("1. ya");
                System.out.println("2. tidak");
                System.out.println("pilih:");
                pilih=masuk.nextInt();
                if (pilih==1)
                System.out.println("coin sedang dikirim dan selamat bergatcha");
                else if (pilih==2)
                System.out.println("MASUKAN PILIHAN NOMINAL COIN:");
                pilih=masuk.nextInt();
                if (pilih==1)
            System.out.println("harga 100 coin : 16 ribu");
        else if (pilih==2)
            System.out.println("harga 500 coin : 50 ribu");
        else if (pilih==3)
            System.out.println("harga 1000 coin : 100 ribu");
        else
            System.out.println("MAAF KODE SALAH, SILAHKAN COBA LAGI");
            }
        }
    }
}
