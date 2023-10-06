public class Personaje implements IHabilidadEspecial{
    private String nombre;
    private int raza;
    private int hp;

    public static final int HUMANO = 0;
    public static final int MAGO = 1;
    public static final int ELFO = 2;
    
    public Personaje(String nombre){
        setNombre(nombre);
        setHp(100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean estaVivo(){
        return hp > 0;
    }

    private String obtenerNombreRaza(int _raza){
        String nombreRaza = "";

        switch(_raza){
            case HUMANO:
                nombreRaza = "Humano";
            break;

            case MAGO:
                nombreRaza = "Mago";
            break;

            case ELFO:
                nombreRaza = "Elfo";
            break;

            default:
                nombreRaza = "Humano";
            break;
        }

        return nombreRaza;
    }

    @Override
    public String toString(){
        String estado = "Nombre: " + nombre + "\r\n"
                + "Raza: " + obtenerNombreRaza(raza) + "\r\n"
                + "Vida restante: " + hp;

        return estado;
    }

    @Override
    public int atacar(Personaje objetivo) {
       return 5; //Daño base
    }

    @Override
    public void usarHabilidadUnica() {
        setHp(getHp() - 10); //Se reduce su nivel de vida debido al uso de esta habilidad
    }

    @Override
    public void recibirDanio(int danio) {
        setHp(getHp() - danio);
    }

    
}
