import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException
	{
	
		System.out.println("in view...");
		try {
			ArrayList<Adminbean> list=UserDao.getDriveListFromDb();
			
			System.out.println(list);
			
		    String jsonstr=(String) UtilityJson.getJSONFromObject(list);
		    System.out.println(jsonstr);
		    response.getWriter().write(jsonstr);
            response.flushBuffer();		    
		} catch (ClassNotFoundException e) {
			//System.out.println("11111");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}

}
