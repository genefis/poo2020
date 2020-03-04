package polimorfismo_figura;
public abstract class Figura {
    protected String nombre;
    protected double area;
    public abstract void CalcularArea();
    public abstract void SetNombre(String nombre);
    public String getNombre() {
        return nombre;
    }
    public double getArea() {
        return area;
    }
}
