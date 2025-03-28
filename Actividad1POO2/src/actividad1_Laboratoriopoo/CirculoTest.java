/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_Laboratoriopoo;

/**
 *
 * @author Diesel
 */
public class CirculoTest {
    public static void main(String[] args){
        double areaCirc = 0;
        Circulo c = new Circulo();
        System.out.println("Radio del Circulo: " + c.getRadio());
        System.out.println("Area del Circulo: " + c.getArea(c, areaCirc));
        System.out.println("--------------------------------------------");
        Circulo c2 = new Circulo(6.55, "Azul");
        System.out.println("Radio del Circulo con sobrecarga: " + c2.getRadio());
        System.out.println("Area del Circulo sobrecarga: " + c2.getArea(c, areaCirc));
        
        //4.i. Crear un objeto de tipo Círculo y modifica los valores por defecto. 
        Circulo c3 = new Circulo(10.01, "Morado");
        
    }   
}
