package com.hand.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Service.FilmService;
import com.hand.ServiceImpl.FilmServiceImpl;

/**
 * Servlet implementation class ChangeFilm
 */
public class ChangeFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeFilm() {
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
		int id=0;
		String languageid=request.getParameter("languageid");
		if(languageid!=null)
		{
			id=Integer.parseInt(languageid);
		}
		int filmid=0;
		String Filmid=request.getParameter("filmid");
		if(Filmid!=null)
		{
			filmid=Integer.parseInt(Filmid);
		}
		System.out.println(languageid);
		String description=request.getParameter("description");
		FilmService fs=new FilmServiceImpl();
		fs.UpdatetoFilm(title, description, id,filmid);
        request.getRequestDispatcher("/FilmServlet").forward(request, response);		
	}

}
