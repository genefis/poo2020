package polimorfismo_figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void CalcularArea() {
        area=base*altura/2;
    }
    @Override
    public void SetNombre(String nombre) {
        this.nombre=nombre;
    }

}
