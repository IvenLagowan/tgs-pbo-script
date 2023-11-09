package deretuas;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class deret_bilangan {
    public static void main(String[] args) {
    try {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      int deret = 0;
      int a = 7;
      int b = 15;
      int x = 3;
     
      System.out.println("Masukkan Jumlah Deret : ");
      deret = Integer.parseInt(input.readLine());
     
      for (x = 0; x < deret; x++) {
        System.out.println("Masukkan Angka :");
          a = Integer.parseInt(input.readLine());
          b = b+a;
      }
        System.out.println("Jumlah :" +b);
   
    } catch (IOException ex) {
      Logger.getLogger(deret_bilangan.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
 }

