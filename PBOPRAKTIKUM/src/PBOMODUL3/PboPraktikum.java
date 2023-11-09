
package PBOMODUL3;

import Pbomaster.EasyReader; 
import PBOMODUL3.Login;

public class PboPraktikum {
public static void main (String[]Args){ 
    EasyReader er = new EasyReader();
    Login log = new Login();

System.out.println("Default User & Password :");
System.out.println("Username: "+ log.getName());
System.out.println("Password: "+ log.getPass()); 
System.out.println(""); System.out.println("================================");
System.out.print("Username: "); 
log.setName(er.readLine()); 
System.out.print("Password: "); 
log.setPass(er.readLine()); 
System.out.println("");

System.out.println("Updated User & Password :");
System.out.println("Username: "+ log.getName()); 
System.out.println("Password: "+log.getPass()); 
System.out.println("");
}
}
