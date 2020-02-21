package matrizpoo;

public class sumaMatriz {
    private int matrizA[][]=new int [3][3];
    private int matrizB[][]=new int [3][3];
    private int matrizC[][]=new int [3][3];
    public sumaMatriz(int matrizA[][], int matrizB[][]){
        this.matrizA=matrizA;
        this.matrizB=matrizB;
    }
    public int[][]  calcularSuma(){
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                matrizC[i][j]=matrizB[i][j]+matrizA[i][j];
            }
        }
        return matrizC;
    }
    public void presentar(int matriz[][]){

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println(" ");
        }


    }

}
