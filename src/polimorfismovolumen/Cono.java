package polimorfismovolumen;

public class Cono extends  Cuerpo{
    private double radio;
    private double altura;
    public Cono(double radio,double altura,String nombre){
        this.radio=radio;
        this.altura=altura;
    }

    @Override
    public void CalcularVolumen() {
        volumen =(Math.PI*(radio*radio)*altura)/3;
    }
}
