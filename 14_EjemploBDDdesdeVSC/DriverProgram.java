import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection connect = null;
		 Statement statement = null;
		 PreparedStatement preparedStatement = null;
		 ResultSet resultSet = null;
		 
		 try {
			 
			 Class.forName("com.mysql.jdbc.Driver");
			 
	         // Setup the connection with the DB
	         connect = DriverManager
	                 .getConnection("jdbc:mysql://localhost/loginapp?"
	                         + "user=java_user&password=test1234");

	         // Statements allow to issue SQL queries to the database
	         statement = connect.createStatement();
	         
	         // Result set get the result of the SQL query
	         resultSet = statement
	                 .executeQuery("select * from loginapp.vehiculo");
	         writeResultSet(resultSet);
	         
			 
		 }catch(Exception e) {
			 System.out.println(e.getMessage() + e.getStackTrace());
		 }
		 
		 

	}
	
	
	private static void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
        	
            String placa = resultSet.getString("placa");
            String marca = resultSet.getString("marca");
            String linea = resultSet.getString("linea");
            int modelo = resultSet.getInt("modelo");
            System.out.println("**************");
            System.out.println("Placa : " + placa);
            System.out.println("Marca : " + marca);
            System.out.println("Linea : " + linea);
            System.out.println("Modelo : " + modelo);
        }
    }

}
