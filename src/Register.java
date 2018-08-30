import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			String un = request.getParameter("un");
			String uc = request.getParameter("uc");
			
			Model m= new Model();
			m.setUn(un);
			m.setUc(uc);
			
			boolean b = m.register();
			response.sendRedirect("/Servlet1/success.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
