package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/addBook")
public class AddBookServlet extends GenericServlet
{
	int k=0;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		BookBean bb=new BookBean();
		bb.setCode(req.getParameter("code"));
		bb.setbName(req.getParameter("bName"));
		bb.setbAuther(req.getParameter("bAuther"));
		bb.setbPrice(Float.parseFloat(req.getParameter("bPrice")));
		bb.setbQty(Integer.parseInt(req.getParameter("bQty")));
		
		BookDAO b=new BookDAO();
		k=b.insert(bb);
		if(k>0) {
			pw.println("<br>data inserted successfully ....."+"<br>");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
	}

}
