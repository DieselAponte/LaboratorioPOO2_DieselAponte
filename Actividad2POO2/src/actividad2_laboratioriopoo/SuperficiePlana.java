/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_laboratioriopoo;
import java.util.List;

/**
 *
 * @author Diesel
 */
public class SuperficiePlana {
    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana(List<FiguraGeometrica> figurasGeometricas) {
        this.figurasGeometricas = figurasGeometricas;
    }
    
    public void imprimirAreas(){
        for(FiguraGeometrica f : figurasGeometricas){
            System.out.println("Area de la figura " + f.getNombre() + ": " + f.calcularAreaFigura());
        }
    }

    public List<FiguraGeometrica> getFigurasGeometricas() {
        return figurasGeometricas;
    }

    public void setFigurasGeometricas(List<FiguraGeometrica> figurasGeometricas) {
        this.figurasGeometricas = figurasGeometricas;
    }
    
    
}
