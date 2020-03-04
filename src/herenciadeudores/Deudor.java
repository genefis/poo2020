package herenciadeudores;

public class Deudor  {
    private String numCuentaD;
    protected int numClienteD;
    protected String nomD;
    protected double capPrest;
    protected double tazaInt;
    protected int plazoInvD;


    /**
     *  metodo que obtiene el valor de la variable
     * @return numClienteD
     */
    public int getNumClienteD() {
        return numClienteD;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param numCliented
     */
    public void setNumCliented(int numCliented) {
        this.numClienteD = numCliented;
    }

    /**
     *  Metodo que obtiene el valor de la variable
     * @return nomD
     */
    public String getNomD() {
        return nomD;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param nomD
     */
    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

    /**
     *  Metodo que obtiene el valor de la variable
     * @return capPrest
     */
    public double getCapPrest() {
        return capPrest;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param capPrest
     */
    public void setCapPrest(double capPrest) {
        this.capPrest = capPrest;
    }

    /**
     *  Metodo que obtiene el valor de la variable
     * @return tazaInt
     */
    public double getTazaInt() {
        return tazaInt;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param tazaInt
     */
    public void setTazaInt(double tazaInt) {
        this.tazaInt = tazaInt;
    }

    /**
     *  Metodo que obtiene el valor de la variable
     * @return plazoInv
     */
    public int getPlazoInvD() {
        return plazoInvD;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param plazoInvD
     */
    public void setPlazoInvD(int plazoInvD) {
        this.plazoInvD = plazoInvD;
    }

    /**
     * Metodo que obtiene el valor de la variable
     * @return numCuentaD
     */
    public String getNumCuentaD() {
        return numCuentaD;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param numCuentaD
     */
    public void setNumCuentaD(String numCuentaD) {
        this.numCuentaD = numCuentaD;
    }
}

