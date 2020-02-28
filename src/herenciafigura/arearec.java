package herenciafigura;

public class arearec {
    protected double base;
    protected double altura;
    protected double area;
    public arearec(double base,double altura){
        this.altura=altura;
        this.base=base;
    }
    public void CalcularAreaRec(){
        area=base*altura;
    }
    public double ObtenerAreaRect(){
        return  area;
    }
}
