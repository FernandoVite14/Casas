/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoFigura;

/**
 *
 * @author labtw10
 */
public class Rectangulo extends Figura.Figura{
    private String x;

    public void Rectangulo() {
        x=getColor();
    }
    
    @Override 
    public String getColor(){
         return "Rojo";
     }
    
}
