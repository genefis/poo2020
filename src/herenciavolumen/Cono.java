package herenciavolumen;

public class Cono {
    private double radio;
    private double altura;
    private double volumen;
    public Cono(double radio,double altura,double volumen){
        this.radio=radio;
        this.altura=altura;
        this.volumen=volumen;
    }
    public void VolumenCono(){
        volumen =(Math.PI*(radio*radio)*altura)/3;
    }
    public double ObtVolCono (){
        return  volumen;
    }
}
