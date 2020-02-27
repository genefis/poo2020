package herencia;

/**
 * CLASE QUE HEREDA DE LA CLASE PERSONA CONTENDRA TODOS LOS ATRIBUTOS Y METODOS DE LA CLASE PERSONA
 */
public class Estudiante extends Persona{
    //Atributops de esta clase
    private String carrera;

    /**
     *ES UN CONTRUCTOR CON LAS VARIABLES QUE HERERDA
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nacimiento
     */
    public Estudiante (String carrera,String nombre,String identificacion,String estado_civil,String fecha_nacimiento){
                this.carrera=carrera;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nacimiento=fecha_nacimiento;
    }
    public String getCarrera() {
        return carrera;
    }

    public void matricular() {
        System.out.println("metodo para matricular");
    }
    public void aprender () {
        System.out.println("metodo para aprender");
    }



}
