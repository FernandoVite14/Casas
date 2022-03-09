/*
    Autor: Jesús Vite
    Fecha Creación : 7 mar 2022, 10:26:30
    Fecha Actualización: 8 mar 2022, 09:00:00
    Descripción:clase java usuario
 */
package src.entity;

public class Usuario extends Persona {

    private String codigo, nombreUsuario, contraseña;

    public Usuario(String codigo, String nombreUsuario, String contraseña, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void codigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
