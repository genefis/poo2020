package polimorfismovolumen;

public class Cilindro extends Cuerpo {
   private double radio;
   private double altura;
     public Cilindro(double radio,double altura,String nombre){
       this.radio=radio;
       this.altura=altura;
       this.nombre=nombre;
   }

    @Override
    public void CalcularVolumen() {
        volumen = Math.PI*(radio*radio)*altura;
    }
}
