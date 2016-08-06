package com.hand.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Entity.Actor;
import com.hand.Entity.Film;
import com.hand.Entity.Language;
import com.hand.Service.ActorService;
import com.hand.Service.FilmService;
import com.hand.Service.LanguageService;
import com.hand.ServiceImpl.ActorServiceImpl;
import com.hand.ServiceImpl.FilmServiceImpl;
import com.hand.ServiceImpl.LanguageServiceImpl;

/**
 * Servlet implementation class FilmServlet
 */
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmServlet() {
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
		int pagesize=10;
		int pageindex=1;
		String Pageindex=request.getParameter("pageindex");
		
		if(Pageindex!=null)
		{
			pageindex=Integer.parseInt(Pageindex);
			if(pageindex==0)
			{
				pageindex=1;
			}
		}
		FilmService fs=new FilmServiceImpl();
		LanguageService ls=new LanguageServiceImpl();
		List<Film> films=fs.getFilms(pagesize, pageindex);
		for (int i = 0; i < films.size(); i++) {
			 Film f=films.get(i);
			 Language l=ls.getLanguageById(f.getLanguageid());
			 f.setLanguage(l); 
		}
		request.setAttribute("films", films);	
		request.setAttribute("pageindex", pageindex);
		request.getRequestDispatcher("filmlist.jsp").forward(request, response);
	}
		


}
