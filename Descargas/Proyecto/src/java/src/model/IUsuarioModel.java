/*
    Autor: Jesús Vite
    Fecha Creación : 8 mar 2022, 10:26:30
    Fecha Actualización:
    Descripción:clase java Conexion de conexión a BD
 */
package src.model;

import java.util.List;
import src.entity.Usuario;

/**
 *
 * @author labtw10
 */
public interface IUsuarioModel {
    public void crearRegistro(Usuario usuario);
    public void actualizarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public Usuario obtenerRegistro(int idUsuario);
    public void eliminarRegistro(int idUsuario);
}
