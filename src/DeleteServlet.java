

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("in delete");
		String jsonobject = request.getReader().readLine();
		System.out.println(jsonobject);

		Adminbean lib = (Adminbean) UtilityJson.getObjectFromJSON(jsonobject, Adminbean.class);
		//System.out.println(lib);

		Map<String, String> mp = null;
		try 
		{
			mp = UserDao.delete(lib);
		}
		catch (ClassNotFoundException e) 
		{
          e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		//System.out.println(mp);

		String jsonString = (String) UtilityJson.getJSONFromObject(mp);

		response.getWriter().write(jsonString);

		System.out.println(jsonString);

		response.flushBuffer();

	}
	

}
