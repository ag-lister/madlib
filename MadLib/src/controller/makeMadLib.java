package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class makeMadLib
 */
@WebServlet("/makeMadLib")
public class makeMadLib extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public makeMadLib() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String verb1 = request.getParameter("verb1");
		String verb2 = request.getParameter("verb2");
		String noun1 = request.getParameter("noun1");
		String number = request.getParameter("number");
		
		MadLib user = new MadLib(verb1, verb2, noun1, Integer.parseInt(number));
		
		request.setAttribute("userMadLib", user);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
