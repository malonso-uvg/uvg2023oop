import java.util.ArrayList;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class ArchivoCsvAlmacenamiento implements AlmacenamientoLeible {

	private String path;
	
	public ArchivoCsvAlmacenamiento(String path) {
		setPath(path);
	}
	
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}



	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}



	@Override
	public ArrayList<Vehiculo> obtenerTodosLosVehiculos() {
		return null;
	}

	
}
