/* Nama                     : SAKINAH MUTHAHHARI */
/* NIM                      : 13020200292 */
/* HARI/ TANGGAL DAN WAKTU  : SELAS/ 22 MARET 20:37 */
/* KELAS                    : B3 */

import java.util.Scanner;

public class waktu {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totaljam, totalmenit, totaldetik,jamSekarang,  konversi;
        
        System.out.print("Berapa detik yang ingin anda konversikan : ");
        konversi = input.nextInt();
        
        totaljam     = konversi/3600;
        totalmenit   = (konversi%3600)/60;
        totaldetik   = (konversi%3600)%60;
        jamSekarang  = totaljam %24; 
        
        
        System.out.println("Konversi dari : "+konversi+" detik, Adalah : ");
        System.out.println(jamSekarang+" jam saat ini ");
        System.out.println(totaljam+" jam, "+totalmenit+" menit, "+totaldetik+" detik");
    }
    
    
}