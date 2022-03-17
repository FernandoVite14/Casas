/*
    Autor: Jesús Vite
    Fecha Creación : 16 mar 2022, 10:16:30
    Fecha Actualización:
    Descripción:interface java usuario
 */
package src.service;

import java.util.List;
import src.entity.Usuario;


public interface IUsuarioService {
    public void crearRegistro(Usuario usuario);
    public void actualizarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public Usuario obtenerRegistro(int idUsuario);
    public void eliminarRegistro(int idUsuario);
}
