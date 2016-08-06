package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.Dao.CustomerDao;
import com.hand.Util.jdbCon;


public class CustomerDaoImpl implements CustomerDao {
	 jdbCon Con=jdbCon.getjdbCon();
	public boolean findCustomerByName(String name) {
		Connection con=Con.getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Boolean result=false;
		try {
			pstm=con.prepareStatement("select * from customer where first_name= ?");
			pstm.setString(1, name);
			rs=pstm.executeQuery();
			while(rs.next())
			{
			 result=true;
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
		
		return result;
	}

}
