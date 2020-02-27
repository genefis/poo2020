package herencia;

public class Docente extends Persona {
    private String area;
    public Docente (String area,String nombre,String identificacion,String estado_civil,String fecha_nacimiento){
        this.area = area;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nacimiento=fecha_nacimiento;
    }
    public String getArea() {
        return area;
    }
    public void ensenar() {
        System.out.println("Metodo para ensenar");
    }
    public void  calificar() {
        System.out.println("metodo para matricular");
    }
}
