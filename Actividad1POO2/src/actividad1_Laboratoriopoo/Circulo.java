/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_Laboratoriopoo;

/**
 *
 * @author Diesel
 */
public class Circulo {
    private double radio;
    private String color;
    
    public Circulo(){
        this.radio=12.5;
        this.color="Azul";
    }
    //Constructor sobrecargado 
    public Circulo(double radio, String Color){
        this.radio = radio;
        this.color = "";
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(Circulo c, double area){
       System.out.println("La formula a seguir para calcular su area es:");
       System.out.println(c.radio + " * " + c.radio + " * " + "PI");
       area = c.radio * c.radio * Math.PI;
       return area;
    }
    
    //4.l. Incluir el método toString() en la clase “Circulo.java”.
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
       
}


