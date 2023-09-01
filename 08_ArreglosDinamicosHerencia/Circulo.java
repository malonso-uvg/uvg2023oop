public class Circulo extends FiguraGeometrica{

    private double radio;


    public Circulo(double _radio){
        tipo = CIRCULO;
        setRadio(_radio);
    }

    public void setRadio(double _radio){
        radio = _radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2.00 * getRadio();
    }

    @Override
    public String toString() {
        return "Circulo de radio: " + getRadio();
    }
    
}
