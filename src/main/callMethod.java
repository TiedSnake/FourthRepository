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
public class callMethod
{

    int val = 150;

    int operation(int val)
    {
        val = val * 10 / 100;
        return (val);
    }
    public static void main(String[] args)
    {
        callMethod d = new callMethod();
        System.out.println("Before operation value of data is "+d.val);
        System.out.println("After operation value of data is "+d.operation(100));       //There was a line between line 25 & 26 containing "d.operation(100)". 
//and in line 26 the returned value was "d.val" I changed it to the current case since the logic of the program won't be making any sense if it was "d.val"
    }
}
