

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Editservlet")
public class Editservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("update");
		String jsonobject = request.getReader().readLine();
		System.out.println(jsonobject);

		Adminbean lib = (Adminbean) UtilityJson.getObjectFromJSON(jsonobject, Adminbean.class);
		System.out.println(lib);

		 Map<String,String>mp=UserDao.update(lib);
		 
		   String jsonString = (String) UtilityJson.getJSONFromObject(mp);
			response.getWriter().write(jsonString);
			System.out.println(jsonString);
			response.flushBuffer();

	}
	

}
