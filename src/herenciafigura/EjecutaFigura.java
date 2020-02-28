package herenciafigura;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        boolean bander =true;
        System.out.println("Escoja que figura desea\n.Circulo\nCuadrado\nRectangulo\nTriangulo\nSalir");
        String opcion =entrada.nextLine();
        while (bander=true) {

          switch (opcion){
             case "Circulo":
                 System.out.println("Ingrese el radio");
                 double radio=entrada.nextDouble();
                 Areacir circulo =new Areacir(radio);

                break;
             case "Cuadrado":

                break;
             case "Rectangulo":

              break;
             case "Triangulo":

              break;
             case"Salir":
                bander=false;
             break;
           }
        }
    }

}
