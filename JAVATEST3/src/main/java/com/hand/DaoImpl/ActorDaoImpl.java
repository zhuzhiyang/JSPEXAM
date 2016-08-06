package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.Entity.Actor;
import com.hand.Util.jdbCon;	



public class ActorDaoImpl implements com.hand.Dao.ActorDao {
	 jdbCon Con=jdbCon.getjdbCon();
	    
	public List<Actor> getActors(int pagesize,int pageindex) {
		Connection con=Con.getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		List<Actor> actors=new ArrayList<Actor>();
		try {
			pstm=con.prepareStatement("select * from actor limit ?,? ");
			pstm.setInt(1, (pageindex-1)*pagesize);
			pstm.setInt(2, pagesize);
			rs=pstm.executeQuery();
			while(rs.next())
			{
				Actor a=new Actor();
				a.setActorid(rs.getInt(1));
				a.setFirstname(rs.getString(2));
				a.setLastname(rs.getString(3));
				a.setLastupdate(rs.getDate(4));
				actors.add(a);
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
		
		return actors;
	}

	
	
}
