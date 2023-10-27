import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class MySqlAlmacenamiento implements AlmacenamientoConectable, AlmacenamientoLeible {

	private String username;
	private String password;
	private String db;
	private String host;
	private Connection connection;
	
	public MySqlAlmacenamiento(String host, String db, String username, String password) {
		setHost(host);
		setDb(db);
		setPassword(password);
		setUsername(username);
		connection = null;
	}
	
	public Connection getConnection() throws Exception {
		if (connection == null) {
			Class.forName("com.mysql.jdbc.Driver");
			 
	         // Setup the connection with the DB
	         connection = DriverManager
	                 .getConnection("jdbc:mysql://"+host+"/"+db+"?"
	                         + "user="+username+"&password="+password);
 
		}
		
		return connection;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the db
	 */
	public String getDb() {
		return db;
	}

	/**
	 * @param db the db to set
	 */
	public void setDb(String db) {
		this.db = db;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public void Connect() throws Exception{
		getConnection();
	}

	@Override
	public ArrayList<Vehiculo> obtenerTodosLosVehiculos() throws Exception {
		 Statement statement = null;
		 PreparedStatement preparedStatement = null;
		 ResultSet resultSet = null;
		 
		// Statements allow to issue SQL queries to the database
        statement = getConnection().createStatement();
        
        // Result set get the result of the SQL query
        resultSet = statement
                .executeQuery("select * from loginapp.vehiculo");
        return saveResultsIntoList(resultSet);
        
	}
	
	private ArrayList<Vehiculo> saveResultsIntoList(ResultSet resultSet) throws Exception{
		ArrayList<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();
		
		// ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
        	Vehiculo newVehiculo = new Vehiculo(
        			
        			resultSet.getString("placa")
        			,resultSet.getString("marca")
        			,resultSet.getString("linea")
        			,resultSet.getInt("modelo")
        			
        			);
        
            misVehiculos.add(newVehiculo);
        }
        
        return misVehiculos;
	}

}
