public class Automovil implements Comparable<Automovil>{
    private String marca;
    private String modelo;
    private double precio;

    public Automovil(String marca, String modelo, double precio){
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);

    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Marca: " + getMarca() + " Modelo> " + getModelo() +" Precio: Q." + getPrecio();
    }

    @Override
    public int compareTo(Automovil otroAuto) {

        return (-1)*this.getMarca().compareTo(otroAuto.getMarca());
        /*
        if (this.getPrecio() == otroAuto.getPrecio()){
            return 0;
        } else if (this.getPrecio() > otroAuto.getPrecio()){
            return -1;
        } else 
        {
            return 1;
        } */
        
    }
    

}