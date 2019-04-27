package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.cts.beans.Emp;

public class EmpDao {
	private DataSource dataSource;
	public EmpDao()
	{
		
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public boolean insert(Emp e)
	{
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con=dataSource.getConnection();
			if(con!=null)
			{
				pst=con.prepareStatement("insert into emp(eno,name,address) values(?,?,?)");
				pst.setInt(1, e.getEno());
				pst.setString(2, e.getName());
				pst.setString(3, e.getAddress());
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
}
