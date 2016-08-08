package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.Dao.InventoryDao;
import com.hand.Entity.Film;
import com.hand.Util.jdbCon;

public class InventoryDaoImpl implements InventoryDao {
	jdbCon Con=jdbCon.getjdbCon();
	public void deletetoInventory (int id){
	       Connection con = Con. getConnection ();
	       PreparedStatement pstmt = null;
	       String sql = "delete from inventory where film_id=?";
	       System.out.println("zzy");
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
	public List<Integer> getInventoryidById(int id) {
		Connection con=Con.getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		List<Integer> list=new ArrayList<Integer>();
		Film f=new Film();
		try {
			pstm=con.prepareStatement("select * from inventory where film_id=?  ");
			pstm.setInt(1, id);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				Integer rentalid=rs.getInt(1);
				list.add(rentalid);

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
		
		return list;
	}
	
}
