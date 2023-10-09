public class Juego {


    public static void main(String[] args){

        Personaje jugador1;
        Personaje jugador2;
        boolean turnoJugador1 = true;
        IGraphicalUserInterface interfazGrafica = new ConsoleUI();

        interfazGrafica.iniciarJuego();
        jugador1 = interfazGrafica.crearJugador();
        jugador2 = interfazGrafica.crearJugador();


        while ( interfazGrafica.juegoEstaEnCurso(jugador1, jugador2) ){


            if (turnoJugador1){
                interfazGrafica.realizarAccionPersonaje(jugador1, jugador2);
                interfazGrafica.mostrarEstadoPersonaje(jugador1);
                interfazGrafica.mostrarEstadoPersonaje(jugador2);
            } else {
                interfazGrafica.realizarAccionPersonaje(jugador2, jugador1);
                interfazGrafica.mostrarEstadoPersonaje(jugador1);
                interfazGrafica.mostrarEstadoPersonaje(jugador2);
            }

            turnoJugador1 = !turnoJugador1;            
        }

        interfazGrafica.finalizarJuego(jugador1, jugador2);


    }
}
