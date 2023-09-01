public class Rectangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;

    public Rectangulo(double _base, double _altura){
        tipo = RECTANGULO;
        setBase(_base);
        setAltura(_altura);
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return getAltura() * getBase();
    }
    @Override
    public double calcularPerimetro() {
        return 2 * getBase() + 2 * getAltura();
    }
    @Override
    public String toString() {
        return "Rectangulo de base: " + getBase() + " altura: " + getAltura();
    }

    
}
