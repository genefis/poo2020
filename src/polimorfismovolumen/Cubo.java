package polimorfismovolumen;

public class Cubo extends Cuerpo {
 private double lado;
   public Cubo(double lado,String nombre){
         this.lado=lado;
         this.nombre=nombre;
  }
    @Override
    public void CalcularVolumen() {
        volumen= Math.pow(lado,3);
    }
}
