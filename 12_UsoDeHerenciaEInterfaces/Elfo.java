public class Elfo extends Personaje{

    private int fuerza;

    public Elfo(String nombre) {
        super(nombre);
        setRaza(MAGO);
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
    public void usarHabilidadUnica() {
        super.usarHabilidadUnica();
        fuerza++;
    }

    @Override
    public void recibirDanio(int danio) {
        danio = danio / fuerza;
        super.recibirDanio(danio);
    }

    
    
}
