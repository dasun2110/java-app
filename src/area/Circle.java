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
public class Circle extends Shape{
     protected double R;
   protected double  pi=3.14;
   public  Circle(){
       R=5;
   };
    public double area() {
        {return pi*R*R;}
        
    }
    
}
