/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projek3;

/**
 *
 * @author Acer
 */
public class Projek3 {

    public static void main(String[] args) {
        String emailPenerima = "davidarifqisyahputra.com";
        String nomerHp = "+62767567463";
        String mobileId = "android-11";

        SurelNotifikasi emailNotif = new SurelNotifikasi();
        PesanNotifikasi smsNotif= new PesanNotifikasi();
        MemasukkanNotifikasi pushNotif = new MemasukkanNotifikasi();

        String message = "Tutorial Polimorfisme sudah terbit di Petani Kode, cek sekarang di https://www.petanikode.com/java-oop-polimorfisme";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
    
    }
