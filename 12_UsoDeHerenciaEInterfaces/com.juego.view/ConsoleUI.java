import java.util.Scanner;

public class ConsoleUI implements IGraphicalUserInterface{

    Scanner in;

    public ConsoleUI(){
        in = new Scanner(System.in);
    }

    @Override
    public void mostrarEstadoPersonaje(Personaje _personaje) {
        System.out.println( _personaje.toString() );
    }

    @Override
    public void realizarAccionPersonaje(Personaje personajeActivo, Personaje enemigo) {
        
        System.out.println("Turno del personaje: " + personajeActivo.getNombre());

        boolean finalizarTurno = false;
        do{
            System.out.println("Seleccione su opcion: ");
            System.out.println("1. Atacar");
            System.out.println("2. Utilizar habilidad especial");

            int option = Integer.parseInt(in.nextLine());

            switch(option){
                case 1: 
                    System.out.println("El jugador " + personajeActivo.getNombre() + " ha atacado al juegador " + enemigo.getNombre());
                    int danio = personajeActivo.atacar(enemigo);
                    enemigo.recibirDanio(danio);    
                    System.out.println("El daño causado es de: " + danio + " puntos de vida");
                    finalizarTurno = true;
                break;

                case 2:
                    System.out.println("El jugador " + personajeActivo.getNombre() + " Uso su habilidad especial y se verá reflejado en el siguiente turno");
                    System.out.println( personajeActivo.usarHabilidadUnica() );
                    finalizarTurno = true;
                break;

                default:
                    System.out.println("Opcion no válida, seleccione una opción indicada");
                    finalizarTurno = false;
                break;
            }

        }while(!finalizarTurno);
        


    }

    @Override
    public void iniciarJuego() {
        System.out.println("Bienvenido a batallas de la tierra media");
        System.out.println("Ingese los datos de lso jugadores");
    }

    @Override
    public Personaje crearJugador() {
        System.out.println("Ingrese el nombre de su personaje");
        String nombre = in.nextLine();

        System.out.println("Seleccione su tipo de personaje");
        System.out.println("1. Humano");
        System.out.println("2. Mago");
        System.out.println("3. Elfo");

        int option = Integer.parseInt(in.nextLine());
        Personaje nuevoPersonaje;

        switch (option){
            case 1:
                nuevoPersonaje = new Humano(nombre);
            break;
            
            case 2:
                nuevoPersonaje = new Mago(nombre);
            break;

            case 3:
                nuevoPersonaje = new Elfo(nombre);
            break;

            default:
                System.out.println("Opcion no válida, se asigna humano");
                nuevoPersonaje = new Humano(nombre);
            break;

        }

        return nuevoPersonaje;

    }

    @Override
    public void finalizarJuego(Personaje personaje1, Personaje personaje2) {
        System.out.println("El Juego ha finalizado");

        if (personaje1.getHp() > personaje2.getHp()){
            System.out.println("El ganador es el Jugador 1: " + personaje1.getNombre());
        } else 
        {
            System.out.println("El ganador es el Jugador 2: " + personaje2.getNombre());
        }
    }

    @Override
    public boolean juegoEstaEnCurso(Personaje personaje1, Personaje personaje2) {
        return (personaje1.getHp() > 0) && (personaje2.getHp() > 0);
    }
    
}
