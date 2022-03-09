/*
    Autor: Jesús Vite
    Fecha Creación : 7 mar 2022, 10:26:30
    Fecha Actualización:8 mar 2022, 09:00:00
    Descripción:clase java persona
 */
package src.entity;

public abstract class Persona {
    String nombre, sexo;
    int edad;
    public abstract void codigo();

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
