package calculadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Calculadora() {
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
		double op1, op2, result;
		int operacion;
		String simb_op[] = {"+", "-", "*","/"};
		ServletOutputStream  out = response.getOutputStream();
		op1 = Double.parseDouble(request.getParameter("operando1"));
		op2 = Double.parseDouble(request.getParameter("operando2"));
		operacion = Integer.parseInt(request.getParameter("operacion"));
		result = calcula(op1, op2, operacion);
		out.println("<html>");
		out.println("<head><title>Resultado de calcular con Servlet</title></head>");
		out.println("<body BGCOLOR=\"#E0E0FF\" TEXT=\"blue\">");
		out.println("<h1><center>La operacion efectuada es:</center></h1>");
		out.println("<h2><b><center>"+ op1+" "+ simb_op[operacion-1] + " " + op2 + " = "+ result +
		"</center></b></h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}
	public double calcula(double op1, double op2, int operacion) {
		double result = 0;
		switch (operacion) {
		case 1:
		return op1 + op2;
		case 2:
		return op1 - op2;
		case 3:
		return op1 * op2;
		case 4:
		return op1 / op2;
		}
		return result;
		}
		}


