package com.platzi.platziweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletlogin
 */
@WebServlet(description = "Servlet para manejo de peticiones de login", urlPatterns = { "/ServletLogin" })
public class Servletlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servletlogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//Procesar las entradas
		String usuario = request.getParameter("usuario");
		String empresa = request.getParameter("empresa");
		PrintWriter escritor = response.getWriter();
		if(usuario !=null && empresa != null) {
			if(empresa.equals("Platzi")) {
				escritor.println("Bienvenido a platzi");
			}else {
				escritor.println("Bienvenido...");
			}
		}else {
			escritor.println("Usuario o contraseña incorrecto!!");
		}
		escritor.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
