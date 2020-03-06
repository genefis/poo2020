package datosTipoObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        List<Estudiante> estudiante= new ArrayList<Estudiante>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES");
        boolean ban= true;
        do{
            System.out.println("Digite 1 para nuevo estudiante:");
            System.out.println("Digite 2 para presentar reporte");
            System.out.println("Digite 3 para salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    Estudiante estudiantes = new Estudiante();
                    System.out.print("Ingrese nombre\t");
                    estudiantes.setNombre(entrada.nextLine());
                    System.out.print("Ingrese cedula\t");
                    estudiantes.setCedula(entrada.nextLine());
                    System.out.print("Ingrese Carrera\t");
                    estudiantes.setCarrera(entrada.nextLine());
                    System.out.print("Ingrese edad\t");
                    estudiantes.setEdad(entrada.nextInt());
                    entrada.nextLine();
                    System.out.print("Ingrese Correo\t");
                    estudiantes.setCorreo(entrada.nextLine());
                    entrada.nextLine();

                    estudiante.add(estudiantes);
                    break;

                case 2:
                    System.out.println("ESTUDIANTES");
                    System.out.println("NOMBRE\t\tCEDULA\t\tCARRERA\t\tEDAD\t\tCORREO");
                    for (Estudiante e: estudiante){
                        System.out.println(e.getNombre()+"\t\t"+e.getCedula()+"\t\t"+e.getCarrera()+"\t\t"+e.getEdad()+"\t\t"+e.getCorreo());
                    }
                    break;
                case 3:
                    ban=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(ban==true);
    }
}
