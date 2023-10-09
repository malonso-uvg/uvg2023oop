public interface IGraphicalUserInterface{
    void mostrarEstadoPersonaje(Personaje _personaje);
    void realizarAccionPersonaje(Personaje _personajeActivo, Personaje _enemigo);
    void iniciarJuego();
    Personaje crearJugador();
    void finalizarJuego(Personaje personaje1, Personaje personaje2);
    boolean juegoEstaEnCurso(Personaje personaje1, Personaje personaje2);
}