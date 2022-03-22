/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author walmart
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = new String("José José");
        System.out.println(nombre);
        //System.out.println(charAr(3) );
        System.err.println(nombre.toUpperCase());
        // TODO code application logic here
       /**
JFrame ventana = new JFrame ("Mi primner venytana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
         Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio: Establecer un MOUSE MARCA lOGITECH tipo óptico
    miCompu.setRaton(new Mouse("Logitech", "Óptico"));
     System.out.println(miCompu);
     
     
   Computadora compu2 = new Computadora("Apple", "MacBook Pro",
           new Monitor ("Toshiba", 14.3f),
           new Mouse("Acteck","optico"),
           new Teclado("Apple",101),
           new Procesador("Ml",3.4f));
   System.out.println(compu2);
   
   compu2.getRaton().setMarca("Apple");
   compu2.getRaton().setTipo("Touch");
   System.out.println(compu2);
    
   System.out.println("----- Composición y herencia en la misma clase -----");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitec");
        System.out.println(server);
  
       
    
    }

   
    
    
}
