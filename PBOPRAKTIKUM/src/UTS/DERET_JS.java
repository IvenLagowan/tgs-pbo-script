
package UTS;

import java.util.Scanner;
public class DERET_JS {
    
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Membuat Deret Angka  ##");
    System.out.println("========================================");
    System.out.println();
      
    int jumlah_deret,i;
     
    System.out.print("Jumlah deret yang diinginkan pembeda : ");
    jumlah_deret = input.nextInt();
    System.out.println();
  
    for (i=1; i<=jumlah_deret; i++) {
      System.out.print(i*5 + " ");
    }
    System.out.println();
  }
}