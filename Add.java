
package com.mycompany.addtwonumbers;

import java.util.Scanner;

public class Add{
    public static int add(int x,int y)
    {
        return x+y;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Add xyz = new Add();
        int a ,b,result;
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Enter another number: ");
        b = sc.nextInt();
        
        //result = a+b;
        result = xyz.add(a,b);
        System.out.println("Addition: "+result);
        
    }
    
}
