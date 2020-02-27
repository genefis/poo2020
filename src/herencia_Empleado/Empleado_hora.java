package herencia_Empleado;

public class Empleado_hora extends Empleado{
    protected int hora;
    protected Double valorhora;

    public Empleado_hora(int hora,double valorhora,String nombre,String cargo, String dependencia){
        this.hora=hora;
        this.valorhora=valorhora;
        this.nombre=nombre;
        this.cargo=cargo;
        this.dependencia=dependencia;

    }
    public int getHora() {
        return hora;
    }

    public Double getValorhora() {
        return valorhora;
    }

}
