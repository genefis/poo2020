package herencia;
import java.util.Scanner;
public class Ejecuta_personal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Creacion del objeto
        Estudiante est = new Estudiante();
        String nombre,identificacion,estado_civil,fecha,carrera;
        System.out.println("CREACION DEL OBJETO");
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese ka identificacion");
        identificacion = entrada.nextLine();
        System.out.println("Ingrese carrera");
        carrera = entrada.nextLine();
        System.out.println("Ingrese el estado civil");
        estado_civil= entrada.nextLine();
        System.out.println("Ingrese fecha de nacimiento");
        fecha=entrada.nextLine();
        est.setNombre(nombre);
        est.setIdentificacion(identificacion);
        est.setCarrera(carrera);
        est.setEstado_civil(estado_civil);
        est.setFecha_nacimiento(fecha);
        System.out.println("DATOD DEL OBJETO ESTUDIANTE");
        System.out.println("Nombre"+est.getNombre());
        System.out.println("Identificacion"+est.getIdentificacion());
        System.out.println("Carrera"+est.getCarrera());
        System.out.println("Estado_civil"+est.getCarrera());
        System.out.println("Fecha de nacimiento"+est.getFecha_nacimiento());

    }




}
