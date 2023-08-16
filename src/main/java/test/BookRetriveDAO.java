package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookRetriveDAO 
{
	ArrayList<BookBean> al=new ArrayList<BookBean>();
	public ArrayList<BookBean> retrieve(){
		try {
			Connection con=BookDBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from BookDetails51");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				BookBean bb=new BookBean();
				bb.setCode(rs.getString(1));
				bb.setbName(rs.getString(2));
				bb.setbAuther(rs.getString(3));
				bb.setbPrice(rs.getFloat(4));
				bb.setbQty(rs.getInt(5));
				al.add(bb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
