package herencia_Empleado;

public class Asalariado extends Empleado {
    protected double valor_mensual;
    public Asalariado (Double valor_mensual,String nombre,String cargo, String dependencia){
        this.valor_mensual=valor_mensual;
        this.nombre=nombre;
        this.cargo=cargo;
        this.dependencia=dependencia;
    }

    public double getValor_mensual() {
        return valor_mensual;
    }

}
