/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek3;

/**
 *
 * @author Acer
 */
public class MemasukkanNotifikasi implements TampilanNotifikasi{
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim Push Notif ke " + receiver + " dengan isi:");
        System.out.println(content);
}
    }