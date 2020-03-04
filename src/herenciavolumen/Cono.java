package herenciavolumen;

public class Cono {
    private double radio;
    private double altura;
    private double volumen;
    public Cono(double radio,double altura,String nombre){
        this.radio=radio;
        this.altura=altura;
    }
    public void VolumenCono(){
        volumen =(Math.PI*(radio*radio)*altura)/3;
    }
    public double ObtVolCono (){
        return  volumen;
    }
}
