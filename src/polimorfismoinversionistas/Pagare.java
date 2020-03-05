package polimorfismoinversionistas;

public class Pagare extends Inversionista {
    private double tazaInt;

    // Metodo constructor creado con variables heredadas
    public Pagare(String numCu, int numCl, String nom, double capInvert, int plazo) {
        this.numCuenta=numCu;
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;

    }

    @Override
    public void interesGanado() {
        if (capInvert >= 1000 && capInvert <= 2400) {
            tazaInt = 0.05;
            interesganado = (capInvert * tazaInt) * plazoInv;
        } else if (capInvert > 2800) {
            tazaInt = 0.08;
            interesganado = (capInvert * tazaInt) * plazoInv;

        }
    }
}