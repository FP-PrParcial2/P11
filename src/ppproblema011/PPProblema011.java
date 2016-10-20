/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema011;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      String Unidades[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decenas[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centenas[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      System.out.println("Ingresa el número a convertir");
      int N = sc.nextInt();
      int u=N%10;
      int d=(N/10)%10;
      int c=N/100;
      if(N>=100){         
          System.out.println(Centenas[c]+Decenas[d]+Unidades[u]);
      }else{
          if(N>=10){
              System.out.println(Decenas[d]+Unidades[u]);          
          }else{
              System.out.println(Unidades[N]);          
          }          
      }          
    }
}
