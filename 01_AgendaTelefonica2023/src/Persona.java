/**
 * 
 */

/**
 * @author MAAG
 * Codigo generado por medio de chatGPT
 */
public class Persona {
    private String nombre;
    private String email;
    private Integer phoneNumber;

    /**
     * Constructor por defecto de la clase Persona.
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros para inicializar los atributos de la clase Persona.
     *
     * @param nombre      El nombre de la persona.
     * @param email       El email de la persona.
     * @param phoneNumber El número de teléfono de la persona.
     */
    public Persona(String nombre, String email, Integer phoneNumber) {
        this.nombre = nombre;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Obtiene el nombre de la persona. :)
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nombre de la persona a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el email de la persona.
     *
     * @return El email de la persona.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email de la persona.
     *
     * @param email El email de la persona a establecer.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return El número de teléfono de la persona.
     */
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param phoneNumber El número de teléfono de la persona a establecer.
     */
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}