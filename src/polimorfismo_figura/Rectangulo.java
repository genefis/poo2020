package polimorfismo_figura;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    @Override
    public void CalcularArea() {
        area=base*altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public void SetNombre(String nombre) {
        this.nombre=nombre;
    }
}
