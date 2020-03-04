package Deber_seleccion;

public class N_mayor {
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    public N_mayor (double n1,double n2, double n3, double n4){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        this.n4=n4;
    }
    public Double calcular_mayor () {
        double mayor;
        if (n1 > n2 & n1 > n3 & n1 > n4) {
            mayor = n1;
        } else if (n2 > n1 & n2 > n3 & n2 > n4) {
            mayor = n2;
        } else if (n3 > n1 & n3 > n2 & n3 > n4) {
            mayor = n3;

        } else {
            mayor = n4;
        }
        return mayor;
    }
}
