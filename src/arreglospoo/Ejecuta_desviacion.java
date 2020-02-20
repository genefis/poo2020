package arreglospoo;

import java.util.Scanner;

public class Ejecuta_desviacion {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("INGRESE LOS VALORES DEL ARREGLO");
        int Arreglo[]=new int [15];
        for (int i=0;i<Arreglo.length;i++) {
            System.out.print("VALOR"+(i+1));
            Arreglo[i]=entrada.nextInt();
        }
        Desviacion desviacion = new Desviacion(Arreglo);
        desviacion.Desviacion();
        for (int i=0;i<Arreglo.length;i++) {
            System.out.println(Arreglo[i]+"\t"+desviacion.Desviacion());

        }
    }
}
