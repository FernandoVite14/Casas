/*
    Autor: Jesús Vite
    Fecha Creación : 8 mar 2022, 10:26:30
    Fecha Actualización:
    Descripción:clase java Conexion de conexión a BD
 */
package src.model;

import db.Conexion;
import java.sql.*;
import java.util.ArrayList;
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
        try {
            conexion = new Conexion();
            connection = conexion.getConnection();
            String sql = "insert into usuario(codigo, nombreusuario, contraseña) values (?,?,?);";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, usuario.getCodigo());
                statement.setString(2, usuario.getNombreUsuario());
                statement.setString(3, usuario.getContraseña());
                statement.executeUpdate();
                System.out.println("Datos insertados");
            }
            conexion.getDesconnection();
        } catch (Exception c) {
            System.out.println("Error: " + c);
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            connection = conexion.getConnection();
            String sql = "update usuario set codigo =?, nombreusuario=?, contraseña=? ";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, usuario.getCodigo());
                statement.setString(2, usuario.getNombreUsuario());
                statement.setString(3, usuario.getContraseña());
           
                statement.executeUpdate();
                System.out.println("Datos actualizados");
            }
            conexion.getDesconnection();
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    @Override
    public void eliminarRegistro(String idUsuario) {
        try {
            conexion = new Conexion();
            connection = conexion.getConnection();
            String sql = "delete from usuario where codigo= '"+idUsuario+"';";
            Statement s = connection.createStatement();
            int rs = s.executeUpdate(sql);
            System.out.println("Datos elimanados");
            conexion.getDesconnection();
        } catch (Exception c) {
            System.out.println("Error: " + c);
        }
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listausuario = null;
        try {
            ResultSet resulSet;
            listausuario = new ArrayList<>();
            conexion = new Conexion();
            connection = conexion.getConnection();
            String sql = "select * from usuario";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                resulSet = statement.executeQuery();

                while (resulSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setCodigo(resulSet.getString(1));
                    usuario.setNombreUsuario(resulSet.getString(2));
                    usuario.setContraseña(resulSet.getString(3));
                    listausuario.add(usuario);
                }
            }
            conexion.getDesconnection();
        } catch (Exception c) {
            System.out.println("Error: " + c);
        }
        return listausuario;
    }

    @Override
    public Usuario obtenerRegistro(String  codigo) {
        Usuario usuario = null;
        try {
            ResultSet resulSet;
            usuario = new Usuario();
            conexion = new Conexion();
            connection = conexion.getConnection();
            String sql = "select * from usuario where codigo=?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                 statement.setString(1, codigo);
                resulSet = statement.executeQuery();

                while (resulSet.next()) {

                    usuario.setCodigo(resulSet.getString(1));
                    usuario.setNombreUsuario(resulSet.getString(2));
                    usuario.setContraseña(resulSet.getString(3));

                }
            }
            conexion.getDesconnection();
        } catch (Exception c) {
            System.out.println("Error: " + c);
        }
        return usuario;

    }
    
    public static void main(String[] args) {
        UsuarioModelImpl im1 =new UsuarioModelImpl();
        
        Usuario u1 = new Usuario("789","Administrador", "789");
        
        im1.crearRegistro(u1);
        u1.setContraseña("hola");
        u1.setNombreUsuario("contador");
        //im1.actualizarRegistro(u1);
        
        //im1.eliminarRegistro("10");
        im1.obtenerRegistros();
        im1.obtenerRegistro("13");
        
    }
}
