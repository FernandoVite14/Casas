/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.List;
import src.entity.Usuario;

/**
 *
 * @author labtw10
 */
public interface UsuarioModel {
    public void crearRegistro(Usuario usuario);
    public void actualizarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistros();
    public Usuario obtenerRegistro(int idUsuario);
    public void eliminarRegistro(int idUsuario);
}
