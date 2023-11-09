/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOMODUL2;
import Pbomaster.EasyReader;
import PBOMODUL2.SepedaMotor;

public class PboPraktikum {
    public static void main(String[]arsg){
        EasyReader er = new EasyReader();
       SepedaMotor sm = new SepedaMotor(); 
       
       System.out.print("Merek Motor Anda: ");
       sm.setMerk(er.readLine());
       System.out.print("Motor ANDA Mereknya adalah: "+ sm.getMerk());
       
    }
}
