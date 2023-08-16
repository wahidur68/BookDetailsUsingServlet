package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDAO {
	int k=0;
	public int insert(BookBean bb) {
		try {
			Connection con=BookDBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into BookDetails51 values(?,?,?,?,?)");
			ps.setString(1, bb.getCode());
			ps.setString(2,bb.getbName());
			ps.setString(3, bb.getbAuther());
			ps.setFloat(4, bb.getbPrice());
			ps.setInt(5, bb.getbQty());
			k=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return k;
	}

}
