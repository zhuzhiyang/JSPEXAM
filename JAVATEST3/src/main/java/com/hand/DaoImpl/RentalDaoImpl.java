package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.hand.Dao.RentalDao;
import com.hand.Util.jdbCon;

public class RentalDaoImpl implements RentalDao {
	jdbCon Con=jdbCon.getjdbCon();
	public void deletetoRental (List<Integer> ids){
	       Connection con = Con. getConnection ();
	       PreparedStatement pstmt = null;
	       String sql = "delete from rental where inventory_id = ?";
	       System.out.println("zzy123");
	       System.out.println(ids.size());
	       try {
	    	   pstmt =con.prepareStatement(sql);
	    	   for(int i=0;i<ids.size();i++)
	    	   {
	    		   Integer id=ids.get(i);
	    		   System.out.println(id);
	            pstmt.setInt(1, id);
	            System .out . println( "删除成功！" ) ;
	            pstmt.executeUpdate();
	    	   }
	      
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
