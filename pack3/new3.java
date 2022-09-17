/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.pack3;

import java.util.Scanner;
import pack.calculator;
import pack.scientific;
public class new3 {

    
    public static void main(String[] args) 
    {
        calculator c=new calculator();
        scientific s=new scientific();
        Scanner o=new Scanner(System.in);
        System.out.println("enter a and b:");
        int a=o.nextInt();
        int b=o.nextInt();
        System.out.println("enter c1:");
        double c1=o.nextInt();
        c.divide(a,b);
        s.tan(c1);
    }
    
}
