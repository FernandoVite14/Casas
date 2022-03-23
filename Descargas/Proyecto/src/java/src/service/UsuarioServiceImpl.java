/*
    Autor: Jesús Vite
    Fecha Creación : 16 mar 2022, 10:16:30
    Fecha Actualización:
    Descripción:clase java Conexion de conexión a BD
 */
package src.service;

import java.util.List;
import src.entity.Usuario;
import src.model.IUsuarioModel;
import src.model.UsuarioModelImpl;


public class UsuarioServiceImpl implements IUsuarioService{
IUsuarioModel modelo = new UsuarioModelImpl();
    @Override
    public void crearRegistro(Usuario usuario) {
        modelo.crearRegistro(usuario);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        modelo.actualizarRegistro(usuario);
    }
        
    @Override
    public void eliminarRegistro(int idUsuario) {
       modelo.eliminarRegistro(String.valueOf(idUsuario));
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        
        return modelo.obtenerRegistros();
    }
    
    public Usuario obtenerRegistro(String codigo){
        return (Usuario) modelo.obtenerRegistros();
    }
    //ya

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
