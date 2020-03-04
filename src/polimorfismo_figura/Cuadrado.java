package polimorfismo_figura;
public class Cuadrado  extends Figura{
    private  double lado;

    public double getBase() {
        return lado;
    }

    public void setBase(double base) {
        this.lado =lado;
    }
    @Override
    public void CalcularArea() {
        area=Math.pow(lado,2);
    }

    @Override
    public void SetNombre(String nombre) {
        this.nombre=nombre;
    }
}
