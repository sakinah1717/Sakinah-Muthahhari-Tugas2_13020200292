/* Nama                     : SAKINAH MUTHAHHARI */
/* NIM                      : 13020200292 */
/* HARI/ TANGGAL DAN WAKTU  : MINGGU/ 20 MARET 11:27 */
/* KELAS                    : B3 */

import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {

       /**
        * @param args
        */
       public static void main(String[] args) {
             // TODO Auto-generated method stub
            /* Kamus */
            int a;
            Scanner masukan;
             /* Program */
             System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
             masukan = new Scanner(System.in);
             a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/ 
             System.out.print ("Nilai yang dibaca : "+ a);
       }
  }