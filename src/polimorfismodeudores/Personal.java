package polimorfismodeudores;

public class Personal  extends Deudor {
    private double intGePe;
    private double tazaA;

    /**
     * Creacion de un metood cosntructor
     * @param numCu
     * @param numCl
     * @param nom
     * @param capPrest
     * @param plazo
     */
    public Personal(String numCu, int numCl, String nom, double capPrest, int plazo){
        this.setNumCuentaD(numCu);
        this.numClienteD = numCl;
        this.nomD = nom;
        this.capPrest = capPrest;
        this.plazoInvD = plazo;


    }

    /**
     * Metodo que cacula el interes
     */
    public void calcularIntPe() {
        tazaA = 0.10;
        intGePe = capPrest * (tazaA * plazoInvD);
    }

    /**
     * Metodo que obtiene el valor de la variable
     * @return
     */
    public double getIntGePe() {
        return intGePe;
    }

    /**
     * metodo que actualiza el valor de la variable
     * @param intGePe
     */
    public void setIntGePe(double intGePe) {
        this.intGePe = intGePe;
    }

    /** metodo que obtiene el valor de la variable
     *
     * @return tazaA
     */
    public double getTazaA() {
        return tazaA;
    }

    /**
     * Metodo que catualiza le valor de la variable
     * @param tazaA
     */
    public void setTazaA(double tazaA) {
        this.tazaA = tazaA;
    }
}
