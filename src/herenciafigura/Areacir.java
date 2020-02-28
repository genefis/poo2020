package herenciafigura;

public class Areacir {
    private double radio;
    private double area;

    public double getRadio() {
        return radio;
    }

    public void Radio(double radio) {
        this.radio = radio;
    }

    public void CalcularAreaCir() {
        area=Math.PI*(radio*radio);
    }
    public double obtener_area(){
        return area;
    }
}
