package arreglospoo;

public class sumpro {
    private int [] vectorA = new int[10];
    private int [] vectorB = new int[10];
    private int sumatoria_producto=0;
    public sumpro(int []vectorA,int []vectorB){
        this.vectorA=vectorA;
        this.vectorB=vectorB;
    }
    public int calculo (){
        for(int i=0;i<10;i++) {
            sumatoria_producto = sumatoria_producto + (vectorA[i] * vectorB[i]);

        } return sumatoria_producto;    }
}
