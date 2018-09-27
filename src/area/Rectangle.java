/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author dasun
 */
public class Rectangle extends Shape {
     protected double width,height;
     public Rectangle(){
         width=12;
         height=11;
     }
   
    public double area() {
        {return width*height;}
    }
}
