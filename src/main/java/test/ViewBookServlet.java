package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/viewBook")
public class ViewBookServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		BookRetriveDAO brd=new BookRetriveDAO();
		ArrayList<BookBean> al=brd.retrieve();
		if(al.size()==0) {
			pw.println("data is not available .."+"<br>");
		}else
		{
			Iterator<BookBean> it=al.iterator();
			while(it.hasNext()) {
				BookBean bb=it.next();
				pw.println(bb.getCode()+"&nbsp &nbsp"+bb.getbName()+"&nbsp &nbsp"+bb.getbAuther()
				+"&nbsp &nbsp"+bb.getbPrice()+"&nbsp &nbsp"+bb.getbQty()+"<br>");
			}
			
		}
	   RequestDispatcher rd=req.getRequestDispatcher("link.html");
	   rd.include(req, res);
	}

}
