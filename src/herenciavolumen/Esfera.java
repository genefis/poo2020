package herenciavolumen;

public class Esfera extends Cuerpo {
    private double radio;
    private  double volumen;
    public Esfera(double radio,String nombre){
        this.radio=radio;
        this.nombre=nombre;
    }
    public void VolumenEsfera(){
        volumen = 4/3*(Math.PI*(radio*radio*radio));
    }
    public double ObtVolEsfera(){
        return volumen;
    }
}
