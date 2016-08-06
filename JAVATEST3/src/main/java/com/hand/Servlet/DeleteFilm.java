package com.hand.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Service.FilmActorService;
import com.hand.Service.FilmService;
import com.hand.ServiceImpl.FilmActorServiceImpl;
import com.hand.ServiceImpl.FilmServiceImpl;

/**
 * Servlet implementation class DeleteFilm
 */
public class DeleteFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFilm() {
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
		String filmid=request.getParameter("filmid");
		int id=0;
		if(filmid!=null)
		{
			id=Integer.parseInt(filmid);
		}
		System.out.println(id);
		FilmActorService fas=new FilmActorServiceImpl();
		fas.deletetoFilmActor(id);
		FilmService fs=new FilmServiceImpl();
		fs.deletetoFilm(id);
	}
  
}
