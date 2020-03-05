package polimorfismovolumen;

public class Esfera extends Cuerpo {
    private double radio;
    private  double volumen;
    public Esfera(double radio,String nombre){
        this.radio=radio;
        this.nombre=nombre;
    }

    @Override
    public void CalcularVolumen() {
        volumen = 4/3*(Math.PI*(radio*radio*radio));
    }
}
