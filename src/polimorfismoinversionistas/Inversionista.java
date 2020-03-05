package polimorfismoinversionistas;
public abstract  class Inversionista {
    protected String numCuenta;
    protected int numCliente;
    protected String nom;
    protected double capInvert;
    protected double interesanual;
    protected int plazoInv;
    protected double interesganado;
    public abstract void interesGanado();

    public double getInteresganado() {
        return interesganado;
    }
}

