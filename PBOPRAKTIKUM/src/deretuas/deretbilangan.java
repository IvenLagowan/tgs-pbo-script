
package deretuas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class deretbilangan {

 
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int angka1=0,angka2=1,deret,hasil;
     
     
        System.out.print("Masukkan bilangan: ");
        deret = input.nextInt();
     
        if (deret>2){
        for(int i=0;i<deret;i++){
            hasil=angka1+angka2;
            angka1=angka2;
            angka2=hasil;
            System.out.print(hasil);
            System.out.print(" , ");
        }
        }else{
            System.out.print("Deret kurang dari 3");
        }
    }
 
}
