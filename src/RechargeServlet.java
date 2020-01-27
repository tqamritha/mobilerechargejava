import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RechargeServlet")
public class RechargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jsonobject = request.getReader().readLine();
		
//		System.out.println(jsonobject);
//		
//		Userbean lib = (Userbean) UtilityJson.getObjectFromJSON(jsonobject, Userbean.class);
//		System.out.println(lib);

		 
	}

}
