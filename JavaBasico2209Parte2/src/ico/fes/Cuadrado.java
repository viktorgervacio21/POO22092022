/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Viktor
 */
public class Cuadrado implements Figura{

  
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    @Override
    public float calcularArea() {
        return this.lado * this.lado;
    }
    }
    
    

