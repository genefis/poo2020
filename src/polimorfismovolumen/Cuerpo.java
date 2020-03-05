package polimorfismovolumen;

public abstract class Cuerpo {
    protected String nombre;
    protected double volumen;

    public abstract void  CalcularVolumen();

    public String getNombre() {
        return nombre;
    }

    public String obtenernombre (){
        return nombre;
    }

    public double getVolumen() {
        return volumen;
    }
}
