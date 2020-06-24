/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kmanv
 */
public class test {
    
    public static void main(String args[])
    {
        Product p= new Product("Miscellanes","plain","2.5");
        
        Honey h= new Honey("Wildflower","500.0","Miscellanes1111","plain","2.5");
        
        System.out.println(p.toString());
        System.out.println(h.toString());
        
        System.out.println("name"+p.getProductName()+"$"+p.getCost());
        System.out.println("name"+h.getProductName()+" $"+h.getCost());
    }
}
