
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException
	{
		
		String jsonobject = request.getReader().readLine();
		System.out.println(jsonobject);

		Userbean lib = (Userbean) UtilityJson.getObjectFromJSON(jsonobject, Userbean.class);
		System.out.println(lib);

		Map<String, String> mp = null;
		try {
			mp = UserDao.chklogin(lib);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jsonString = (String) UtilityJson.getJSONFromObject(mp);
		response.getWriter().write(jsonString);
		System.out.println(jsonString);
		response.flushBuffer();
	}

}
