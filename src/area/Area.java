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
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Circle cl =new Circle();
       
        System.out.println("Circle area is "+cl.area());
        
        Rectangle re =new Rectangle();
        System.out.println("Rectangle area is "+re.area());
        Triangle ti =new Triangle();
        System.out.println("Triangle area is "+ti.area());
    }
    
}
