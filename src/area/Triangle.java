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
public class Triangle extends Shape{
        protected double h,b;

    
    public Triangle(){//formiual =1/2(h*b)
        h=8.0;
        b=3.0;
    }
    
    public double area() {
        {return (b*h)/2;}  
    }
    
}
