/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_laboratioriopoo;

/**
 *
 * @author Diesel
 */
public class Punto {
    public int coordenada_x;
    public int coordenada_y;

    public Punto(){
        this.coordenada_x = 0;
        this.coordenada_y = 0;
    }
    
    public Punto(int coordenadaX, int coordenadaY){
        this.coordenada_x = coordenadaX;
        this.coordenada_y = coordenadaY;
    }
    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + "X=" + coordenada_x + ", Y=" + coordenada_y ;
    }
    
    public double getDistancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.coordenada_x - this.coordenada_x, 2) + Math.pow(otro.coordenada_x - this.coordenada_x, 2));
    }

    // Método sobrecargado sin parámetros que calcula la distancia desde el origen (0, 0)
    public double getDistancia() {
        Punto origen = new Punto(0, 0); // Punto (0,0)
        return getDistancia(origen); // Llamamos al método con parámetro
    }
    
}
