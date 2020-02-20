package arreglospoo;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ejecuta_sumapro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vectorA []= new int [10];
        int vectorB []= new int [10];
        System.out.println("INGRESE VALORES DEL VECTOR A");
        for (int i=0;i<10;i++){
            System.out.print("VALOR "+(i+1)+":");
            vectorA[i]=entrada.nextInt();
            entrada.nextLine();
        }
        System.out.println("INGRESE VALORES DEL VECTOR B");
        for (int i=0;i<10;i++){
            System.out.print("VALOR "+(i+1)+":");
            vectorB[i]=entrada.nextInt();
            entrada.nextLine();
        }
        sumpro sumpro = new sumpro(vectorA, vectorB);
        System.out.print("VECTOR A: ");
        for (int i=0;i<10;i++){
            System.out.print(vectorA[i]+"\t");

        }
        System.out.println();
        System.out.print("VECTOR B: ");
        for (int i=0;i<10;i++){
            System.out.print(vectorB[i]+"\t");

        }
        System.out.println();
        System.out.println("EL PRODUCTO ES:\t"+sumpro.calculo());

    }
}
