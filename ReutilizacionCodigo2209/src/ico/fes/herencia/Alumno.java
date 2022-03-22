/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author walmart
 */
        
    public class Alumno extends Persona {

    private String numCuenta;
    private String carrera;

   
       

    public Alumno(String numCuenta, String carrera) {
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public Alumno(String numCuenta, String carrera, String nombre, int edad) {
        // Super: Invoca constructor de la super clase o clase base (Persona)
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numCuenta=" + numCuenta + ", carrera=" + carrera + '}';
    }
    
    public void estudiar(int cantidad){
        System.out.println(this.getNombre()+" esta estudiando "+ cantidad + "horas");
    }

    public void setNumeroCuenta(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
