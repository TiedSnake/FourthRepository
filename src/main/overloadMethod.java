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
public class overloadMethod
{

    public void area(int b, int h)  //b--> base, h-->height.
    {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }

    public void area(int r) //r-->radius.
    {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
    public static void main(String[] args)
    {
        overloadMethod ob = new overloadMethod();
        ob.area(10, 12);
        ob.area(5);
    }
}
