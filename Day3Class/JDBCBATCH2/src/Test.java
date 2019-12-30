import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.api.jdbc.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/hospital?useSSL=false";
		String uname="root";
		String pass="1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		String query="select doc_id,doc_name from doctor";
		Statement st=(Statement) con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			String ag=rs.getString("doc_id");
			String nm=rs.getString("doc_name");
			System.out.print(" "+nm);
			System.out.println(" "+ag);

			
		}
		
		
		
		
		

	}

}
