/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class methodExecution
{

    public int multiplyNumbers(int a, int b)
    {
        int z = a * b;
        return z;
    }
    public static void main(String[] args)
    {
        methodExecution b = new methodExecution();
        int ans = b.multiplyNumbers(10, 3);
        System.out.println("Multiplication is:"+ans);
        
        //Call by value
    }
}
