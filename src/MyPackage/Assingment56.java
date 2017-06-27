package MyPackage;
import java.sql.*;

public class Assingment56 {

	public static void main(String[] args) throws Exception{
		Statement st= null;
		Connection con = null;
		try{
			Class.forName("");
			con=DriverManager.getConnection("");
			st= con.createStatement();
			st.execute("create table Books(Author varchar(10),BookName varchar(20),Category varchar(10))");
			System.out.println("Table Books Created");
			st.addBatch("insert into values Books('Rohit','JAVA','ComputerScience')");
			st.addBatch("insert into values Books('Kranti','C++',Social)");
			st.addBatch("insert into valus Books('Sukh','Algebra','Maths')");
			System.out.println("Inserted");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			st.close();
			con.close();
		}
	}

}
