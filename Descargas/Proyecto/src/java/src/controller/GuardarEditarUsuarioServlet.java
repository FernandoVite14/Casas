/*
    Autor: Jesús Vite
    Fecha Creación : 17 mar 2022, 10:49:30
    Fecha Actualización: 23 mar 2022, 10:48:44
    Descripción:clase servlet
 */
package src.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import src.entity.Usuario;
import src.service.IUsuarioService;
import src.service.UsuarioServiceImpl;

public class GuardarEditarUsuarioServlet extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario u = new Usuario();
        int edad= Integer.parseInt(request.getParameter("edad"));
        u.setCodigo(request.getParameter("idUsuario"));
        u.setContraseña(request.getParameter("contraseña"));
        u.setEdad(edad);
        u.setNombre(request.getParameter("nombre"));
        u.setNombreUsuario(request.getParameter("usuario"));
        u.setSexo(request.getParameter("sexo"));
        service.actualizarRegistro(u);
        response.sendRedirect("ListarUsuarioServlet");
    }

}
