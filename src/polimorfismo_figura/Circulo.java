package polimorfismo_figura;

public class Circulo extends Figura{
    private double radio;
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void CalcularArea() {
        area=Math.PI*Math.pow(radio,2);
    }

    @Override
    public void SetNombre(String nombre) {
        this.nombre=nombre;
    }
}
