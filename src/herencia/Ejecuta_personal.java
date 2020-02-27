package herencia;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Ejecuta_personal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre,identificacion,estado_civil,fecha,carrera;
        System.out.println("INGRESAR DATOS");
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese La identificacion");
        identificacion = entrada.nextLine();
        System.out.println("Ingrese el estado civil");
        estado_civil= entrada.nextLine();
        System.out.println("Ingrese fecha de nacimiento");
        fecha=entrada.nextLine();
        System.out.println("Los datos ingresados pertenecen a:\n1.Docente\n2.Estudiante\n3.Adminisytrativo");
        int opcion= entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingrese carrera");
                carrera = entrada.nextLine();
                Estudiante est = new Estudiante(carrera,nombre,identificacion,estado_civil,fecha);
                System.out.println("DATOS ESTUDIANTE");
                System.out.println("Nombre"+est.getNombre());
                System.out.println("Identificacion"+est.getIdentificacion());
                System.out.println("Carrera"+est.getCarrera());
                System.out.println("Estado_civil"+est.getEstado_civil());
                System.out.println("Fecha de nacimiento"+est.getFecha_nacimiento());
            break;
            case 2:
                System.out.println("Ingrese area del docente");
                String area=entrada.nextLine();
                Docente docente = new Docente(area,nombre,identificacion,estado_civil,fecha);

                System.out.println("DATOS DOCENTE");
                System.out.println("Nombre"+docente.getNombre());
                System.out.println("Identificacion"+docente.getIdentificacion());
                System.out.println("Fecha de nacimiento"+docente.getFecha_nacimiento());
            break;
            case 3:
                System.out.println("Ingrese la dependencia");
                String dependencia=entrada.nextLine();
                Administrativo adm = new Administrativo(dependencia,nombre,identificacion,estado_civil,fecha);
                 System.out.println("DATOS ADMINISTRATIVO");
                System.out.println("Nombre"+adm.getNombre());
                System.out.println("Identificacion"+adm.getIdentificacion());
                System.out.println("Fecha de nacimiento"+adm.getFecha_nacimiento());
                break;
        }

    }
}
