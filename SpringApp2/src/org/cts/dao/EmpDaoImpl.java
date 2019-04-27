package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.cts.beans.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmpDaoImpl implements EmpDao {
	@Autowired
	DataSource dataSource;
	public EmpDaoImpl()
	{
		
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public boolean insert(Emp e) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isInserted=false;
		try {
			con=dataSource.getConnection();
			pst=con.prepareStatement("insert into emp values(?,?,?)");
			pst.setInt(1, e.getEno());
			pst.setString(2, e.getName());
			pst.setString(3, e.getAddress());
			int r=pst.executeUpdate();
			if(r>0)
				isInserted=true;
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return isInserted;
	}
	

}
