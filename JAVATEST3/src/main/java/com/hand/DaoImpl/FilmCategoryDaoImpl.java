package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hand.Dao.FilmCategoryDao;
import com.hand.Util.jdbCon;

public class FilmCategoryDaoImpl implements FilmCategoryDao {
	jdbCon Con=jdbCon.getjdbCon();
	public void deletetoFilmCategoty (int id){
	       Connection con = Con. getConnection ();
	       PreparedStatement pstmt = null;
	       String sql = "delete from film_category where film_id=?";
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
}
