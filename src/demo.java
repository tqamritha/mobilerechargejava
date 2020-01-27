

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.json.JSONException;



@WebServlet("/demo")

public class demo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		
			String jsoninput=request.getReader().readLine();
			
			System.out.println(jsoninput);
	
			Userbean userbean=(Userbean) UtilityJson.getObjectFromJSON(jsoninput, Userbean.class) ;
			
			System.out.println(userbean);
			
			try {

				Map<String,String>MapResponse=UserDao.insertUser(userbean);
				
				String jsonString=UtilityJson.getJSONFromObject(MapResponse);
				
				response.getWriter().write(jsonString);
				
				System.out.println(jsonString);
				
				response.flushBuffer();
				
			}
			
			catch (JSONException e) 
			{
				e.printStackTrace();
			}
			
			
						
	}
	
	}

