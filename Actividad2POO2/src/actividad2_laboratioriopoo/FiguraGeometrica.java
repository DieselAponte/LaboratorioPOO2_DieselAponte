/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_laboratioriopoo;

/**
 *
 * @author Diesel
 */
public abstract class FiguraGeometrica {
    private String nombre;
    
    public FiguraGeometrica(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Los metodos abstractos deben de ser implementados por las clases hijas
    public abstract double calcularAreaFigura();
    public abstract boolean esRegular();
}
