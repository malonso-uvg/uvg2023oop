import java.util.ArrayList;

/**
 * 
 */

/**
 * @author MAAG
 * Clase que representa una agenda de contactos.
 * Documentado por medio de chatGPT
 */
public class Agenda {

    /**
     * El propietario de la agenda.
     */
    public String owner; // NOTA: No se recomienda hacer públicos los atributos. Se hace aquí solo para propósitos de ejemplo.

    /**
     * Lista interna que contiene los contactos de la agenda.
     */
    public ArrayList<Persona> agendaInterna;

    /**
     * Constructor de la clase Agenda.
     *
     * @param owner El nombre del propietario de la agenda.
     */
    public Agenda(String owner) {
        this.owner = owner;
        agendaInterna = new ArrayList<Persona>();
    }

    /**
     * Guarda un contacto en la agenda.
     *
     * @param persona El objeto Persona a guardar en la agenda.
     * @return true si el contacto fue guardado exitosamente, false en caso contrario.
     */
    public boolean saveContact(Persona persona) {
        int cantidadInicial = agendaInterna.size();
        agendaInterna.add(persona);
        return cantidadInicial < agendaInterna.size();
    }

    /**
     * Obtiene una lista de todos los contactos en la agenda.
     *
     * @return Una lista de objetos Persona que representa todos los contactos en la agenda.
     */
    public ArrayList<Persona> showAllContacts() {
        return agendaInterna;
    }

    /**
     * Busca una persona por su nombre en la agenda.
     *
     * @param name El nombre de la persona a buscar.
     * @return El objeto Persona correspondiente al nombre especificado si se encuentra, o null si no se encuentra.
     */
    public Persona searchPersonaByName(String name) {
        for (int i = 0; i < agendaInterna.size(); i++) {
            if (agendaInterna.get(i).getNombre().equals(name)) {
                return agendaInterna.get(i);
            }
        }
        return null;
    }
}