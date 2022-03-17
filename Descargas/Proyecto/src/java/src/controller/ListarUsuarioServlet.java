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


@WebServlet(name = "ListarUsuarioServlet", urlPatterns = {"/ListarUsuarioServlet"})
public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hola Servlet</h1>");
    }
}
