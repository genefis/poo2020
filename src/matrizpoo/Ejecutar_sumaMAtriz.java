package matrizpoo;
import java.util.Scanner;
public class Ejecutar_sumaMAtriz {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int matrizA[][]=new int [3][3];
         int matrizB[][]=new int [3][3];
         int matrizC[][]=new int [3][3];
        System.out.println("INGRESE LOS DATOS DE LA MATRIZ A");
        for(int i=0;i<3;i++) {
             for(int j=0;j<3;j++) {
                 System.out.print("DATO"+(i+1));
                matrizA[i][j]=entrada.nextInt();
            }
        }
        System.out.println("INGRESE LOS DATOS DE LA MATRIZ B");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print("DATO"+(i+1)+","+(j+1));
                matrizB[i][j]=entrada.nextInt();
            }
        }
        sumaMatriz Suma = new sumaMatriz(matrizA,matrizB);
        System.out.print("MATRIZ A\n");
        Suma.presentar(matrizA);
        System.out.print("MATRIZ B\n");
        Suma.presentar(matrizB);
        System.out.print("MATRIZ C\n");
        matrizC= Suma.calcularSuma();
        Suma.presentar(matrizC);
    }



}


