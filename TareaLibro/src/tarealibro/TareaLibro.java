/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author Viktor
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //atributos
        Libro Libro1 = new Libro();
        Libro1.setNombre("Memoria de mis putas tristes");
        System.out.println("Nombre del libro: "+ Libro1.getNombre());
        Libro1.setAutor("Gabriel García Márquez");
        System.out.println("Autor :"+ Libro1.getAutor());
        Libro1.setEditorial("Diana");
        System.out.println("Editorial: "+Libro1.getEditorial());
        Libro1.setAnno("2004");
        System.out.println("Año de publicación: "+Libro1.getAnno());
        Libro1.setPaginas("112 páginas");
        System.out.println("Este libro tiene: "+Libro1.getPaginas());
        
        
        
        
        
        
        
        
        //metodos 
         Libro1.acelerar();
         
         Libro1.avanzar();
        
    
}
    
    
}
