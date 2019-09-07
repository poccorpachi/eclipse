package com.senati.servet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Saludo
 */
public class Saludo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Saludo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	//response.getWriter().append("Served at: ").append(request.getContextPath());
		//creamos  la bariable usuario y asignamos  el valor en al campo 
		//del formulario
		String usuario = request.getParameter("usuario");
		String password= request.getParameter("password");
		System.out.println(usuario);
		System.out.println(password);
		
		if (usuario.equals("admin") && password.equals("123@")) {
			System.out.println("welcome...!!! java webs");
			request.setAttribute("usuarioLogueado", usuario);
			//para  que se dirija ala paguina jsp 
			request.getRequestDispatcher("bienvenida.jsp").forward(request,response);
		}else {
			System.out.println("error en la credencial");
			// paara que se dirija la pg index.html
			response.sendRedirect("index.html");
			
		}
	}

}
