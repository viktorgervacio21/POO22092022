/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author walmart
 */
public class EstudianteDepArt  extends Persona implements Deportista, Artista{
    
     private String carrera;
    private String numeroCuenta;
    private String disciplinaDep;
    private String generoArt;

    public EstudianteDepArt() {
    }

    public EstudianteDepArt(String carrera, String numeroCuenta, String disciplinaDep, String generoArt) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.disciplinaDep = disciplinaDep;
        this.generoArt = generoArt;
    }

    public String getGeneroArt() {
        return generoArt;
    }

    public void setGeneroArt(String generoArt) {
        this.generoArt = generoArt;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDisciplinaDep() {
        return disciplinaDep;
    }

    public void setDisciplinaDep(String disciplinaDep) {
        this.disciplinaDep = disciplinaDep;
    }

    @Override
    public String toString() {
        return "EstudianteDepArt{" + "carrera=" + carrera + ", numeroCuenta=" + numeroCuenta + ", disciplinaDep=" + disciplinaDep + ", generoArt=" + generoArt + '}';
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre + " está entrenando " + this.disciplinaDep);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre + " está jugando " + this.disciplinaDep);
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre + " está ensayando " + this.generoArt);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + " está presentando su obre de " +  this.generoArt);
    }
    
}
