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


public class EditarUsuarioServlet extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int idUsuario=Integer.parseInt(request.getParameter("idUsuario"));
        IUsuarioService service= new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario = service.obtenerRegistro(idUsuario);
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/Resources/css/style.css'");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='GuardarEditarUsuarioServlet' method='GET'>");
        out.println("<input type='hidden' name='idUsuario' value='"+usuario.getCodigo()+"'>");
        out.println("<label>nombre: </label>");
        out.println("<input type='text' name='nombre' value='"+usuario.getNombre()+"'>");
        out.println("<label>pwd: </label>");
        out.println("<input type='text' name='contraseña' value='"+usuario.getContraseña()+"'>");
        out.println("<label>edad: </label>");
        out.println("<input type='text' name='edad' value='"+usuario.getEdad()+"'>");
        out.println("<label>sexo: </label>");
        out.println("<input type='text' name='sexo' value='"+usuario.getSexo()+"'>");
        out.println("<input type=\"submit\" value='Guardar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

}
