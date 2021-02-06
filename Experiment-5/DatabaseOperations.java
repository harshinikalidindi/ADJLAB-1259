package fee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.PreparedStatement;

public class DatabaseOperations {
	public Connection getDBConnect(){
		Connection con=null;
		try {
			// load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			// DriverManager.getConnection(connectionURL, username,password)
			
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void closeDBConnection(Connection con){
		try
        {
            con.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	
	public int insertData(ArrayList<POJOClass> list){
		int rows=0;
		try{
			Connection con=getDBConnect();
			//create insert query relevent to your application with ? instead of values 
			String query="insert into feetable values(?,?,?)";
			
			PreparedStatement psmt=con.prepareStatement(query);
			
			// Create object of Iterator from ArrayList and then iterate through
			
			Iterator<POJOClass> it=list.iterator();
			
			while(it.hasNext()){
				// Create POJO object from it.next
				POJOClass object=it.next();
				// call setXXX() methods to set the values with the values of POJO class members by calling its getter in place of each ?
				
				psmt.setString(1, object.getReg());
				psmt.setString(2,object.getFee());
				psmt.setString(3,object.getCategory());
				rows +=psmt.executeUpdate();
			}
	      closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
				
		return rows;
 }
	
	// define selectqueryN () for each select query in the problem statement. 
	public void selectData()
	// Parameter list as per your requirement to set the values into select query
	{
		try{
			// prepare select query relevant to your requirement with ? .
			String query="SELECT category, SUM(fee) FROM feetable GROUP BY category";
			Connection con=getDBConnect();
			PreparedStatement psmt=con.prepareStatement(query);
			
			// call psmt.setXXX() methods to set the values into all ? in query.
			
			// execute query
			ResultSet rs1=psmt.executeQuery();
			
			// Iterate rs to show results of query
			System.out.println("Category\tTotal Fees");
			while(rs1.next()){
				System.out.println(rs1.getString(1)+"\t"+rs1.getString(2));
			}
			
			
			closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}