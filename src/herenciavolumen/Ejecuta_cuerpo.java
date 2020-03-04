package herenciavolumen;
import java.util.Scanner;
public class Ejecuta_cuerpo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio,altura;
        boolean ban = true;
        System.out.println("AREA DE CUERPOS GEOMETRICOS");
        System.out.println("ESCOJA LA FIGURA:\n.CONO\n.CUBO\n.ESFERA\n.CILINDRO");
        String nombre = entrada.nextLine();
        while (ban=true) {
            switch (nombre) {
                case "CONO":
                    System.out.println("Ingrese la altura del cono");
                    altura = entrada.nextDouble();
                    System.out.println("Ingrese el radio del cono");
                    radio = entrada.nextDouble();
                    Cono cono = new Cono(radio, altura, nombre);
                    cono.ObtVolCono();
                    break;
                case "CUBO":
                    System.out.println("Ingrese el lado del cubo");
                    double lado = entrada.nextDouble();
                    Cubo cubo = new Cubo(lado, nombre);
                    cubo.ObtenerAreaCubo();
                    break;
                case "ESFERA":
                    System.out.println("Ingrese el radio de la esfera");
                    radio = entrada.nextDouble();
                    Esfera esfera = new Esfera(radio, nombre);
                    esfera.ObtVolEsfera();
                    break;
                case "CILINDRO":
                    System.out.println("Ingrese la altura del Cilindro");
                    altura = entrada.nextDouble();
                    System.out.println("Ingrese el radio del Cilindro");
                    radio = entrada.nextDouble();
                    Cilindro cilindro = new Cilindro(radio, altura, nombre);
                    break;
                default:
                        ban=false;
                    break;
            }
        }
    }

}
