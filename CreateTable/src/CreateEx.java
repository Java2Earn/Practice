import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateEx 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	//first Step	
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//Second step
	Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bvrit","bvrit123");
	System.out.println(	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bvrit","bvrit123"));
System.out.println(con);
	//third Step
//fourth step from github
	}
}
