import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.api.jdbc.Statement;

public class test2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/hospital?useSSL=false";
		String uname="root";
		String pass="1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		String doc_id="108234";
		String doc_name="Ankitha";
		String dept="05";
		int phone=988888888;
		String d_gen="Null";
		String insertSt="Insert into doctor values('"+doc_id+"','"+doc_name+"','"+dept+"',"+phone+",'"+d_gen+"')";
		Statement st1=(Statement) con.createStatement();
		st1.executeUpdate(insertSt);
		System.out.println("Record added");
		
	}

}
