
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;

public class UserDao {
	public static void setValues(PreparedStatement statement, Object... values) throws SQLException {
		for (int i = 0; i < values.length; i++) {
			statement.setObject(i + 1, values[i]);
		}

	}

	public static Map<String, String> insertUser(Userbean user) throws JSONException {

		int affectedRows = 0;
		HashMap<String, String> mapResponse = new HashMap();
		
		try {
			Connection con = DBUtil.getDBConnection();
	PreparedStatement pst = con.prepareStatement("insert into user(name,email,password,mobile) values(?,?,?,?)");

			String name = user.getName();
			String password = user.getPassword();
			String email = user.getEmail(); 
			long mobile =user.getMobile();
			// pst.setString(1, firstName);
			Object[] parameter = { name,email,password,mobile };
			setValues(pst, parameter);
			affectedRows = pst.executeUpdate();
			if (affectedRows == 1)
				mapResponse.put("Msg", "SuccessFul SignUp");
			else
				mapResponse.put("Msg", "Error_In_SignUp");
			return mapResponse;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return mapResponse;

	}

	public static Map<String, String> chklogin(Userbean lib) throws SQLException, ClassNotFoundException {

		Map<String, String> mapobject = new HashMap<String, String>();

		

		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps = con.prepareStatement("select * from user");

		ResultSet status = ps.executeQuery();
	
		while (status.next()) 
		{
			if (status.getString(3).equals(lib.getEmail()) && status.getString(4).equals(lib.getPassword())) 
			{
				mapobject.put("status", "user");
				break;
			}
			else if ("admin@gmail.com".equals(lib.getEmail()) && "admin123".equals(lib.getPassword()))
			{
				mapobject.put("status", "admin");
				break;
			} 
			else 
			{
				mapobject.put("status", "Error");
			}
		}
		return mapobject;

	}

	public static Map<String, String> saveAdmin(Adminbean user) {
		int affectedRows = 0;
		HashMap<String, String> mapResponse = new HashMap();
		
		try {
			Connection con = DBUtil.getDBConnection();
	PreparedStatement pst = con.prepareStatement("insert into operatordata(operator_name,description,rate) values(?,?,?)");

			String operator= user.getOperator();
			String des = user.getDes();
			int rate = user.getRate(); 
			
			// pst.setString(1, firstName);
			Object[] parameter = { operator,des,rate };
			setValues(pst, parameter);
			affectedRows = pst.executeUpdate();
			if (affectedRows == 1)
				mapResponse.put("Msg", "SuccessFul SignUp");
			else
				mapResponse.put("Msg", "Error_In_SignUp");
			return mapResponse;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return mapResponse;

	}
	
	public static ArrayList<Adminbean > getDriveListFromDb() throws SQLException, ClassNotFoundException {
		ArrayList<Adminbean > list = new ArrayList<>();
		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps1 = con.prepareStatement("select * from operatordata");

		ResultSet resultSet = null;

		resultSet = ps1.executeQuery();
		while (resultSet.next()) {
			Adminbean u = new Adminbean();
			u.setId(resultSet.getInt(1));
			u.setOperator(resultSet.getString(2));
			u.setDes(resultSet.getString(3));
			u.setRate(resultSet.getInt(4));
			

			list.add(u);
		}
		return list;
		}
	
	public static Map<String, String> update(Adminbean  lib) {

		Map<String, String> mapobject = new HashMap<String, String>();

		int status = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement("update operatordata set operator_name=?,description=?,rate=? where id=?");

			ps.setString(1, lib.getOperator());
			ps.setString(2, lib.getDes());
			ps.setInt(3, lib.getRate());
			ps.setInt(4, lib.getId());

			status = ps.executeUpdate();
			if (status == 1) 
			{
				mapobject.put("status", "updated successfully");
			} else {

				mapobject.put("status", "Error");
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return mapobject;
	}
	
	public static Map<String, String> delete(Adminbean lib) throws ClassNotFoundException, SQLException {

		System.out.println("in  delete method ");

		Map<String, String> mp = new HashMap<>();

		int status = 0;
		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps = con.prepareStatement(" delete from operatordata where id=? ");

		ps.setObject(1, lib.getId());

		status = ps.executeUpdate();

		if (status == 1) {

			mp.put("Msg", " Delete successfully");

		} else {
			mp.put("Msg", "Error");
		}

		// System.out.println("bye");
		return mp;
	}

	
	public static ArrayList<Userbean> getuserdata() throws SQLException, ClassNotFoundException {
		ArrayList<Userbean > list = new ArrayList<>();
		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps1 = con.prepareStatement("select * from user");

		ResultSet resultSet = null;

		resultSet = ps1.executeQuery();
		while (resultSet.next()) {
			Userbean u = new Userbean();
			u.setUserid(resultSet.getInt(1));
			u.setName(resultSet.getString(2));
			u.setEmail(resultSet.getString(3));
			u.setPassword(resultSet.getString(4));
			u.setMobile(resultSet.getLong(5));
			

			list.add(u);
		}
		return list;
		}
	
}
