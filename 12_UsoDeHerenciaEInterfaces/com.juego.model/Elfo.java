public class Elfo extends Personaje{

    private int fuerza;

    public Elfo(String nombre) {
        super(nombre);
        setRaza(ELFO);
        fuerza = 1;
    }

    public int Defender(int danio){
        return danio / 2;
    }

    @Override
    public int atacar(Personaje objetivo) {
        int danioCausado = super.atacar(objetivo);

        switch (objetivo.getRaza()){

            case HUMANO:
                danioCausado = danioCausado * fuerza;
            break;

            case MAGO:
              danioCausado = danioCausado * (fuerza / 2);
            break;

            case ELFO:
                danioCausado = danioCausado * (fuerza * 2);
            break;

        }

        return danioCausado;
    }

    @Override
    public String usarHabilidadUnica() {
        fuerza++;
        return super.usarHabilidadUnica() + " La fuerza se ha incrementado, ahora es: " + fuerza;
    }

    @Override
    public void recibirDanio(int danio) {
        danio = danio / fuerza;
        super.recibirDanio(danio);
    }

    
    
}
