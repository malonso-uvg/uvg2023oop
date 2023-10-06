public class Mago extends Personaje{

    private boolean tieneArmadura;
    private int rango;

    public Mago(String nombre) {
        super(nombre);
        setRaza(MAGO);
        tieneArmadura = false;
        rango = 0;
    }
    
    public boolean esMagoBlanco(){
        return rango == 1;
    }

    @Override
    public int atacar(Personaje objetivo) {
       
        int danioCausado = super.atacar(objetivo);

        switch (objetivo.getRaza()){

            case HUMANO:
                if (esMagoBlanco()){
                    danioCausado += 15;
                } else {
                    danioCausado += 7;
                }
            break;

            case MAGO:
                if (esMagoBlanco()){
                    danioCausado += 20;
                } else {
                    danioCausado += 10;
                }
            break;

            case ELFO:
                if (esMagoBlanco()){
                    danioCausado += 13;
                } else {
                    danioCausado += 4;
                }
            break;

        }

        return danioCausado;
    }

    @Override
    public void usarHabilidadUnica() {
        super.usarHabilidadUnica();  //Reduce el hp del usuario
        rango = 1;
    }

    @Override
    public void recibirDanio(int danio) {
        if (esMagoBlanco())
            danio = danio / 2;
       super.recibirDanio(danio);
    }

    

}
