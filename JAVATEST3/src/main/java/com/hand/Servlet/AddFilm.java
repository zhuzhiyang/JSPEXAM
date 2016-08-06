package com.hand.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Entity.Language;
import com.hand.Service.FilmService;
import com.hand.Service.LanguageService;
import com.hand.ServiceImpl.FilmServiceImpl;
import com.hand.ServiceImpl.LanguageServiceImpl;

/**
 * Servlet implementation class AddFilm
 */
public class AddFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title=request.getParameter("title");
		String description=request.getParameter("description");
		String name=request.getParameter("language");
		LanguageService ls=new LanguageServiceImpl();
		Language l=ls.getLanguageByName(name);
		FilmService fs=new FilmServiceImpl();
		fs.InserttoFilm(title, description, l.getLanguageid());
		response.sendRedirect("index.jsp");
	}

}
