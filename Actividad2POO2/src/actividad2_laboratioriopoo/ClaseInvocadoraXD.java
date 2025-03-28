/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_laboratioriopoo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diesel
 */
public class ClaseInvocadoraXD {
    public static void main(String[] args) {
        //Instanciando los puntos
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(3, 4);
        //Construyendo el triangulo
        Triangulo triangulo = new Triangulo("Triángulo 1", p1, p2, p3);
        
        //Agregando el triangulo a la lista e instanciando la lista
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(triangulo);
        
        SuperficiePlana superficie = new SuperficiePlana(figuras);
        superficie.imprimirAreas();

        for (FiguraGeometrica figura : figuras) {
            System.out.println("¿La figura " + figura.getNombre() + " es regular? " + figura.esRegular());
        }
    }
}
