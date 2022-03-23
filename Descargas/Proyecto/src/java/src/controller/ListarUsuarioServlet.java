/*
    Autor: Jesús Vite
    Fecha Creación : 16 mar 2022, 10:49:30
    Fecha Actualización:
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
import java.util.List;
import src.entity.Usuario;
import src.service.IUsuarioService;
import src.service.UsuarioServiceImpl;


@WebServlet(name = "ListarUsuarioServlet", urlPatterns = {"/ListarUsuarioServlet"})
public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th> id </th>");
        out.println("<th> nombre </th>");
        out.println("<th> pwd </th>");
       // out.println("<th> nombre </th>");
        out.println("<th> edad </th>");
        out.println("<th> sexo </th>");
        out.println("</tr>");
        IUsuarioService service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerRegistros();
        for (Usuario usuario: listaUsuario) {
            out.println("<tr>");
            out.println("<td>"
                    +usuario.getCodigo()+"</td>");
            out.println("<td>"
                    +usuario.getNombreUsuario()+"</td>");
            out.println("<td>"
                    +usuario.getContraseña()+"</td>");
           // out.println("<td>"
             //       +usuario.getNombre()+"</td>");
            out.println("<td>"
                    +usuario.getEdad()+"</td>");
            out.println("<td>"
                    +usuario.getSexo()+"</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
    
    
}
