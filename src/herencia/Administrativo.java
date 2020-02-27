package herencia;

/**
 * Clase que hereda de la calse persona
 */
public class Administrativo extends Persona{
    private String dependencia;
    public Administrativo (String dependencia,String nombre,String identificacion,String estado_civil,String fecha_nacimiento){
        this.dependencia = dependencia;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nacimiento=fecha_nacimiento;
    }

    public String getDependencia() {
        return dependencia;
    }
    public void gestionar_personal(){
        System.out.println("sirve para gestionar el personal");
    }
}
