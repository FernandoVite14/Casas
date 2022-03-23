/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import src.service.IUsuarioService;
import src.service.UsuarioServiceImpl;

/**
 *
 * @author labtw10
 */
public class EliminarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                int idUsuario= Integer.parseInt(request.getParameter("idUsuario"));
                IUsuarioService service = new UsuarioServiceImpl();
                service.eliminarRegistro(idUsuario);
                response.sendRedirect("ListarUsuarioServlet");
    }

    
}
