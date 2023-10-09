public class Humano extends Personaje{

    private boolean tieneEspada;
    private boolean tieneEscudo;

    public Humano(String nombre) {
        super(nombre);
        setRaza(HUMANO);
        tieneEspada = false;
        tieneEscudo = true;
    }

    public int DetenerAtaque(int danio){
        if (tieneEscudo){
            return danio / 4;
        } else {
            return danio / 2;
        }
    }

    @Override
    public int atacar(Personaje objetivo) {
        int danioCausado = super.atacar(objetivo);

        switch (objetivo.getRaza()){

            case HUMANO:
                if (tieneEspada){
                    danioCausado = danioCausado * 3;
                } else {
                    danioCausado = danioCausado + 5;
                }
                
            break;

            case MAGO:
                if (tieneEspada){
                    danioCausado = danioCausado * 4;
                } else {
                    danioCausado = danioCausado + 10;
                }
            break;

            case ELFO:
                if (tieneEspada){
                    danioCausado = danioCausado * 2;
                } else {
                    danioCausado = danioCausado + 5;
                }
            break;

        }

        return danioCausado;
    }

    @Override
    public String usarHabilidadUnica() {
       
        tieneEspada = !tieneEspada;
        tieneEscudo = !tieneEscudo;

        String arma = "";
        if (tieneEspada)
            arma = "Espada";
        else
            arma = "Escudo";
        

        return  super.usarHabilidadUnica() + " El humano está utilinado: " + arma;
    }

    @Override
    public void recibirDanio(int danio) {
        if (tieneEscudo)
            danio = danio / 3;
        
        super.recibirDanio(danio);
    }

    

}
