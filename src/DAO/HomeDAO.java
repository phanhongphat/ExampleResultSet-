package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import BEAN.Account;
import java.sql.*;
import java.util.*;

public class HomeDAO 
{
	public static List<Account> DisplayAccount(Connection conn)
	{
		List<Account> list = new ArrayList<Account>();
		
		PreparedStatement ptmt = null;
		
		String sql = "Select * from account" ;
		
		try 
		{
			ptmt = conn.prepareStatement(sql);
			
			ResultSet rs = ptmt.executeQuery();
			
			
			
			while (rs.next())				
			{
				Account acc = new Account();
					String uname = rs.getString("uname");
					String password = rs.getString("password");
					
					acc.setUname(uname);
					acc.setPassword(password);		
					list.add(acc);
		
		}
											
					
			ptmt.close(); 
			rs.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	return list;
	}
}
