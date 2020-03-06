package datosTipoObjeto;
import java.util.Scanner;
public class EjecutaEstudiante {
    //Declaracion de variables
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont, opcion;
        Estudiante[] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        boolean bandera = true;


        for (cont = 0; cont < estudiantes.length-1; cont++) {
            System.out.println("Digite 1 uno si desea ingresar ");
            System.out.println("Digite 2 para salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 1) {
                Estudiante est = new Estudiante();
                System.out.println("Ingrese el nombre");
                est.setNombre(teclado.nextLine());
                System.out.println("Ingrese el numero de cedula");
                est.setCedula(teclado.nextLine());
                System.out.println("Ingrese la edad");
                est.setEdad(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Ingrese la carrera");
                est.setCarrera(teclado.nextLine());
                teclado.nextLine();
                System.out.println("Ingrese el correo");
                est.setCorreo(teclado.nextLine());
                //Asiganmos el objeto est a la variables estudiante
                estudiantes[cont] = est;
                //obtencion de los valores que contiene
                //el tipo de dato estudiante
            }
            System.out.println("LISTA ESTUDIANTES");
            System.out.println(("Cedula\nNombre"));
            int edadAcum=0;
            for (cont = 0; cont < estudiantes.length-1; cont++) {
                edadAcum=edadAcum+ estudiantes[cont].getEdad();
                System.out.println(estudiantes[cont].getCedula()+"\t"+estudiantes[cont].getNombre());
            }
            System.out.println("Edad promedio de los estudiantes que s eingresaron:"+(edadAcum/estudiantes.length));

            System.out.println("FIN DEL PROGRAMA");

        }
    }
}