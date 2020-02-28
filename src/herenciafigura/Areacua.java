package herenciafigura;

public class Areacua {
    protected double lado;
   protected double area;
    public Areacua(double lado){
       this.lado=lado;
    }
    public  void calcularAreaCua(){
        area=lado*lado;
    }
    public double  obtenerAreaCuad(){
        return area;
    }

 }
