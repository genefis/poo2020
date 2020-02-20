package arreglospoo;

public class Desviacion {
    private int []arreglo=new int[15];
    private double media ;
    private double [] desviacion=new double[15];
    public Desviacion(int arreglo[]) {
        this.arreglo=arreglo;
    }
    public double media(){
        for (int i=0;i<arreglo.length;i++) {
            media = media + arreglo[i];
        }
        return media;
    }

    public double [] Desviacion() {
        for (int i=0;i<arreglo.length;i++) {
            desviacion[i] = media -arreglo[i];
        }
        return desviacion;
    }
    public int[] getArreglo() {
        return arreglo;
    }


}