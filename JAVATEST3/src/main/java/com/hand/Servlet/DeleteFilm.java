package com.hand.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Service.FilmActorService;
import com.hand.Service.FilmCategoryService;
import com.hand.Service.FilmService;
import com.hand.Service.FilmtextService;
import com.hand.Service.InventoryService;
import com.hand.Service.RentalSercvice;
import com.hand.ServiceImpl.FilmActorServiceImpl;
import com.hand.ServiceImpl.FilmCategoryServiceImpl;
import com.hand.ServiceImpl.FilmServiceImpl;
import com.hand.ServiceImpl.FilmtextServiceImpl;
import com.hand.ServiceImpl.InventoryServiceImpl;
import com.hand.ServiceImpl.RentalSercviceImpl;

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
//		String path=request.getServletPath();
		int id=0;
		if(filmid!=null)
		{
			id=Integer.parseInt(filmid);
		}
		System.out.println(id);
		InventoryService is=new InventoryServiceImpl();
		RentalSercvice rs=new RentalSercviceImpl();
		List<Integer> rentalids=is.getInventoryidById(id);
		rs.deletetoRental(rentalids);
		is.deletetoInventory(id);
		FilmActorService fas=new FilmActorServiceImpl();
		fas.deletetoFilmActor(id);
		FilmCategoryService fcs=new FilmCategoryServiceImpl();
		fcs.deletetoFilmCategoty(id);
		FilmtextService fts=new FilmtextServiceImpl();
		fts.deletetoFilmText(id);
		FilmService fs=new FilmServiceImpl();
		fs.deletetoFilm(id);
		request.getRequestDispatcher("/FilmServlet").forward(request, response);
	}
  
}
