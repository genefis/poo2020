package herenciafigura;

public class Areacir {
    private double radio;
    private double area;
    public  Areacir(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }


    public void CalcularAreaCir() {
        area=Math.PI*(radio*radio);
    }
    public double obtenerAreaCir(){
        return area;
    }
}
