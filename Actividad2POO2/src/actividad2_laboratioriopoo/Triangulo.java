/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_laboratioriopoo;

import static java.lang.Math.abs;

/**
 *
 * @author Diesel
 */
public class Triangulo extends FiguraGeometrica {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(String nombre, Punto p1, Punto p2, Punto p3) {
        super(nombre);
        this.punto1=p1;
        this.punto2=p2;
        this.punto3=p3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "punto1=" + punto1 + ", punto2=" + punto2 + ", punto3=" + punto3 + '}';
    }
    
    @Override
    public double calcularAreaFigura(){
        double base = punto1.getDistancia(punto2);
        double altura = calcularAltura(base);
        return (base * altura)/2;
    }
   
    private double calcularAltura(double base){
        return Math.abs(punto3.getCoordenada_y() - punto1.getCoordenada_y());
    }
    
    @Override
    public boolean esRegular(){
        double lado1 = punto1.getDistancia(punto2);
        double lado2 = punto2.getDistancia(punto3);
        double lado3 = punto3.getDistancia(punto1);
        
        if(lado1 == lado2 && lado2 ==lado3){
            return true;
        } else{
            return false;
        }
    }
}
