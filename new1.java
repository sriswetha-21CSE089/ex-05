/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.pack1;

import java.util.Scanner;
import pack.*;

/**
 *
 * @author 21cse089
 */
public class new1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculator c=new calculator();
        scientific s=new scientific();
        Scanner o=new Scanner(System.in);
        System.out.println("enter a and b:");
        int a=o.nextInt();
        int b=o.nextInt();
        System.out.println("enter c1:");
        double c1=o.nextInt();
        c.add(a,b);
        s.expo(c1);
    }
    
}
