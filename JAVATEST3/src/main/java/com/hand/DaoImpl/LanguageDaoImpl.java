package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.Dao.LanguageDao;
import com.hand.Entity.Actor;
import com.hand.Entity.Film;
import com.hand.Entity.Language;
import com.hand.Util.jdbCon;

public class LanguageDaoImpl implements LanguageDao {
	 jdbCon Con=jdbCon.getjdbCon();
	 public List<Language> getLanguages() {
			Connection con=Con.getConnection();
			PreparedStatement pstm=null;
			ResultSet rs=null;
			List<Language> languages=new ArrayList<Language>();
			try {
				pstm=con.prepareStatement("select * from language ");
				rs=pstm.executeQuery();
				while(rs.next())
				{
					Language l=new Language();
					l.setLanguageid(rs.getInt(1));
					l.setName(rs.getString(2));
					l.setLastupdate(rs.getDate(3));
					languages.add(l);
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
			
			return languages;
		}
	    
		public Language getLanguageById(int id) {
			Connection con=Con.getConnection();
			PreparedStatement pstm=null;
			ResultSet rs=null;
			Language l=new Language();
			try {
				pstm=con.prepareStatement("select * from language where language_id=?  ");
				pstm.setInt(1, id);
				rs=pstm.executeQuery();
				while(rs.next())
				{
					
					l.setLanguageid(rs.getInt(1));
					l.setName(rs.getString(2));
					l.setLastupdate(rs.getDate(3));
	
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
			
			return l;
		}
		public Language getLanguageByName(String name) {
			Connection con=Con.getConnection();
			PreparedStatement pstm=null;
			ResultSet rs=null;
			Language l=new Language();
			try {
				pstm=con.prepareStatement("select * from language where name=?  ");
				pstm.setString(1, name);
				rs=pstm.executeQuery();
				while(rs.next())
				{
					
					l.setLanguageid(rs.getInt(1));
					l.setName(rs.getString(2));
					l.setLastupdate(rs.getDate(3));
	
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
			
			return l;
		}
}
