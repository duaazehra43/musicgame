import java.sql.*;
public class DBConnection {
	public Connection c;
	public Statement s;
	 
	public DBConnection(){
	       try{
	          Class.forName("com.mysql.cj.jdbc.Driver");
              c = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicgame", "root" ,"duaamemon313!");
	          s = c.createStatement();
	          System.out.print("Database Connected Successfully");
	        }
	       catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	public static void main(String[] args) {
		new DBConnection();
	}
}