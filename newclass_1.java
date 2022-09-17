/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specifier2.newpackage;

/**
 *
 * @author Vishnu
 */
public class newclass_1 {
    int a[]={3,4,5,1,2};
    public void sort()
    {
        
        int t;
        for (int i=0;i<5;i++)
        {
            for (int j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
     public void display()
    {
           for (int i=0;i<5;i++)
           {
               System.out.println(a[i]);
           }
        
    }
    
}
