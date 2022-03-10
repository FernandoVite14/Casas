/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author labtw10
 */
public class PruebaFigura extends TipoFigura.Rectangulo{
    public String x;
    @Override
    public void Rectangulo(){
        x= getColor();
    }
}
