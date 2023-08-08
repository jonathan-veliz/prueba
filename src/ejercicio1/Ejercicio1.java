/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author jonathan veliz
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto yerba=new Producto(150225145,"taragui.",700,25);
        System.out.println("Codigo : "+yerba.getCodigo()+".");
        System.out.println("Descripcion : "+yerba.getDescripcion());
        System.out.println("Precio : "+yerba.getPrecio()+"$.");
        System.out.println("Stock : " +yerba.getStock()+" unidades.");
        
    }
    
}
