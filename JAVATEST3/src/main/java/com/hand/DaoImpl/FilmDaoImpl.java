package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.Dao.FilmDao;
import com.hand.Entity.Actor;
import com.hand.Entity.Film;
import com.hand.Entity.Language;
import com.hand.Util.jdbCon;

public class FilmDaoImpl implements FilmDao {
	jdbCon Con=jdbCon.getjdbCon();
    
	public List<Film> getFilms(int pagesize,int pageindex) {
		Connection con=Con.getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		List<Film> films=new ArrayList<Film>();
		try {
			pstm=con.prepareStatement("select * from film limit ?,? ");
			pstm.setInt(1, (pageindex-1)*pagesize);
			pstm.setInt(2, pagesize);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				Film f=new Film();
				f.setFilm_id(rs.getInt(1));
				f.setTitle(rs.getString(2));
				f.setDescription(rs.getString(3));
				f.setLanguageid(rs.getInt(5));
				films.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			
		}
		
		return films;
	}
	public void InserttoFilm (String title,String description,int languageid) {

         String sql = "insert into film(title,description,language_id) values (?,?,?)";
         Connection con=Con.getConnection();
         PreparedStatement pstmt = null;
         try {
             pstmt =con.prepareStatement(sql);
            pstmt.setString(1, title);
             pstmt.setString (2 , description) ;
             pstmt.setInt ( 3, languageid) ;
             System.out.println(title);
             pstmt.executeUpdate () ;
             System.out.println(title);
         } catch (SQLException e) {
             e .printStackTrace () ;
         } finally {
             try {
               pstmt .close () ;
                 con .close () ;
             } catch (SQLException e) {
            
                 e .printStackTrace () ;
             }
         }
    }
	public void deletetoFilm (int id){
	       Connection con = Con. getConnection ();
	       PreparedStatement pstmt = null;
	       String sql = "delete from film where film_id=?";
	       try {
	    	   pstmt =con.prepareStatement(sql);
	            pstmt.setInt(1, id);
	          System .out . println( "删除成功！" ) ;
	          pstmt.executeUpdate();
	      
	     } catch (SQLException e) {
	        System .out . println( "捕獲到SQL異常" ) ;
	        e .printStackTrace () ;
	        
	     }
	       finally {
	          try {
	            pstmt .close () ;
	   
	            con .close () ;
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e .printStackTrace () ;
	        }

	       }
	   }
	public Film getFilmById(int id) {
		Connection con=Con.getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Film f=new Film();
		try {
			pstm=con.prepareStatement("select * from film where film_id=?  ");
			pstm.setInt(1, id);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				
				f.setFilm_id(rs.getInt(1));
				f.setTitle(rs.getString(2));
				f.setDescription(rs.getString(3));
				f.setLanguageid(rs.getInt(5));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			
		}
		
		return f;
	}
	public void UpdatetoFilm (String title,String description,int languageid,int filmid) {

        String sql = "update film  set title=?,description=?,language_id=? where film_id=?";
        Connection con=Con.getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt =con.prepareStatement(sql);
           pstmt.setString(1, title);
            pstmt.setString (2 , description) ;
            pstmt.setInt ( 3, languageid) ;
            pstmt.setInt ( 4, filmid) ;
            System.out.println(title);
            pstmt.executeUpdate () ;
           
        } catch (SQLException e) {
            e .printStackTrace () ;
        } finally {
            try {
              pstmt .close () ;
                con .close () ;
            } catch (SQLException e) {
           
                e .printStackTrace () ;
            }
        }
   }
}
