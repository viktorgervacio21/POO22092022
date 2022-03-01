/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author walmart
 */
public class Libro {
    private String Nombre;
    private String Autor;
    private String Editorial;
    private String Anno;
    private String Paginas;

    public Libro() {
    }

    public Libro(String Nombre, String Autor, String Editorial, String Anno, String Paginas) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Anno = Anno;
        this.Paginas = Paginas;
    }

    public String getPaginas() {
        return Paginas;
    }

    public void setPaginas(String Paginas) {
        this.Paginas = Paginas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAnno() {
        return Anno;
    }

    public void setAnno(String Anno) {
        this.Anno = Anno;
    }
    //AQUI METODOS
    public void acelerar(){
        System.out.println("Analizando libro para comentar");
    }
    
    public void avanzar(){
        System.out.println("Leyendo el libro para conocer");
    
    }
    
   
   

     
    
}
