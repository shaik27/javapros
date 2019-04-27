package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cts.beans.Product;
import org.cts.util.DBConstants;
import org.cts.util.DBUtil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public boolean insertProduct(Product product) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isInserted=false;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.uname, DBConstants.pwd);
			if(con!=null)
			{
				pst=con.prepareStatement("insert into product(title,imageUrl,price,description) values(?,?,?,?)");
				pst.setString(1, product.getTitle());
				pst.setString(2, product.getImageUrl());
				pst.setString(3, product.getPrice());
				pst.setString(4, product.getDesc());
				int r=pst.executeUpdate();
				if(r>0)
				{
					isInserted=true;
				}
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isInserted;
	}

	@Override
	public List<Product> getAll() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Product> products=new ArrayList<>();
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.uname, DBConstants.pwd);
			st=con.createStatement();
			rs=st.executeQuery("select * from product");
			while(rs.next())
			{
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

}
