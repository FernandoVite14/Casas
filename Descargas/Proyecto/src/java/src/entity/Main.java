/*
    Autor: Jesús Vite
    Fecha Creación : 7 mar 2022, 10:26:30
    Fecha Actualización:8 mar 2022, 09:00:00
    Descripción:clase java principal
 */
package src.entity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Producto p1= new Producto("04253","Barritas","Barritas fresa/piña",12.5);
        Producto p2= new Producto("84535","Chokis","galletas con chocolate",14.0);
        Producto p3= new Producto("85396","Polvorones","Galletas sabor naranja",12.5);
        Producto p4= new Producto("74364","Gansito","pastelito de chocolate con mermelada de fresa",11.5);
        Usuario u1 = new Usuario("43569","Juan","df8782","Juan","masculino",19);
        Usuario u2 = new Usuario("47846","Pedro","sf7e86","Pedro","masculino",17);
        Usuario u3 = new Usuario("48741","Luis","d8743s","Luis","masculino",18);
        Usuario u4 = new Usuario("73438","José","df8864","José","masculino",21);
        
        List <Usuario> lista= new ArrayList<Usuario>();
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        lista.add(u4);
        for (Usuario i : lista){
            System.out.println("código: "+ i.getCodigo());
            System.out.println("Nombre: "+ i.getNombreUsuario());
            System.out.println("Contraseña: "+ i.getContraseña());
            System.out.println("sexo: "+ i.getSexo());
            System.out.println("edad: "+ i.getEdad());
        }
        List <Producto> lista2= new ArrayList<Producto>();
        lista2.add(p1);
        lista2.add(p2);
        lista2.add(p3);
        lista2.add(p4);
        for (Producto i : lista2){
            System.out.println("código: "+ i.getCodigo());
            System.out.println("Nombre: "+ i.getNombre());
            System.out.println("descripción: "+ i.getDescripcion());
            System.out.println("precio: "+ i.getPrecio());
            
        }
    }
}
