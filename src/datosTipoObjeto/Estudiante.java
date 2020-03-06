package datosTipoObjeto;

public class Estudiante {
    private String nombre;
    private String cedula;
    private int edad;
    private String carrera ;
    private String correo;

    public Estudiante(String nombre, String cedula, int edad, String carrera, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.carrera = carrera;
        this.correo = correo;
    }
}
