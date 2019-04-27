package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.cts.beans.User;
import org.cts.util.DBConstants;
import org.cts.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public User validate(String uname, String pwd) {
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement pst=null;
		User user=null;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.uname, DBConstants.pwd);
			pst=con.prepareStatement("select * from users where uname=? and pwd=?");
			pst.setString(1, uname);
			pst.setString(2, pwd);
			rs=pst.executeQuery();
			rs.next();
			user=new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean insert(User user) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isInserted=false;
		try {	
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.uname, DBConstants.pwd);
			if(con!=null)
			{
				pst=con.prepareStatement("insert into users(uname,pwd,utype) values(?,?,?)");
				pst.setString(1, user.getUname());
				pst.setString(2, user.getPwd());
				pst.setString(3, user.getUtype());
				int r=pst.executeUpdate();
				if(r>0)
					isInserted=true;
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isInserted;
	}

}
