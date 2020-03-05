package polimorfismovolumen;

public class Cubo extends Cuerpo {
 private double lado;
 private double area;
  public Cubo(double lado,String nombre){
         this.lado=lado;
         this.nombre=nombre;
  }
  public void  AreaCubo(){
      area= Math.pow(lado,3);
  }
  public double ObtenerAreaCubo(){
      return area;
  }
}
