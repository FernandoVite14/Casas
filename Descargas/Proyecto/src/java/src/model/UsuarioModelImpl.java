/*
    Autor: Jesús Vite
    Fecha Creación : 8 mar 2022, 10:26:30
    Fecha Actualización:
    Descripción:clase java Conexion de conexión a BD
 */
package src.model;

import db.Conexion;
import java.sql.*;
import java.util.List;
import src.entity.Usuario;

/**
 *
 * @author labtw10
 */
public class UsuarioModelImpl implements IUsuarioModel {
    private Conexion conexion;
    private Connection connection;
    
    @Override
    public void crearRegistro(Usuario usuario) {
        try{
            conexion= new Conexion();
            connection=conexion.getConnection();
            String sql="Insert into usuario values()";
            
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
