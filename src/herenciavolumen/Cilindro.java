package herenciavolumen;

public class Cilindro extends Cuerpo {
   private double radio;
   private double altura;
   private  double volumen;
    /// volumen=pi*radio^2
   public Cilindro(double radio,double altura, double volumen,String nombre){
       this.radio=radio;
       this.altura=altura;
       this.volumen=volumen;
       this.nombre=nombre;
   }
   public void VolumenCilindro(){
       volumen = Math.PI*(radio*radio)*altura;
   }
   public double ObtVolCilindro(){
       return volumen;
   }

}
