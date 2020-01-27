
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String jsoninput = request.getReader().readLine();

		System.out.println(jsoninput);

		Adminbean userbean = (Adminbean) UtilityJson.getObjectFromJSON(jsoninput, Adminbean.class);

		System.out.println(userbean);

		Map<String, String> MapResponse = UserDao.saveAdmin(userbean);

		String jsonString = UtilityJson.getJSONFromObject(MapResponse);

		response.getWriter().write(jsonString);

		System.out.println(jsonString);

		response.flushBuffer();

	}

}
