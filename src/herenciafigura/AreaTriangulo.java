package herenciafigura;

public class AreaTriangulo {
    protected double base ;
    protected double altura;
    protected double area;
    public AreaTriangulo(double base, double altuta){
        this. base=base;
        this.altura=altura;

    }
    public void CalcularAreaTri(){
        area=(base*altura)/2;

    }
    public double  ObtenerAreatri(){
        return area;
    }


}
