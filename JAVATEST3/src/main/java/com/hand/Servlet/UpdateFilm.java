package com.hand.Servlet;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Entity.Film;
import com.hand.Entity.Language;
import com.hand.Service.FilmService;
import com.hand.Service.LanguageService;
import com.hand.ServiceImpl.FilmServiceImpl;
import com.hand.ServiceImpl.LanguageServiceImpl;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Servlet implementation class UpdateFilm
 */
public class UpdateFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Configuration cfg;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFilm() {
        super();
        cfg=new Configuration();
         try {
			cfg.setDirectoryForTemplateLoading(new File("templates"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		FilmService fs=new FilmServiceImpl();
		LanguageService ls=new LanguageServiceImpl();
		Film f=fs.getFilmById(id);
	    Language l=ls.getLanguageById(f.getLanguageid());
	    f.setLanguage(l);
	    String name=l.getName();
	    Map map=new HashMap();
	    map.put("film", f);
	    map.put("name", name);
	    Template t=cfg.getTemplate("test.ftl");
	    response.setContentType(t.getEncoding());
	    Writer out=response.getWriter();
	    try {
			t.process(map, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
