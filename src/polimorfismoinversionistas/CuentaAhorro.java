package polimorfismoinversionistas;

public class CuentaAhorro extends Inversionista {
        public CuentaAhorro(String numCu, int numCl, String nom, double capInvert, int plazo) {
        this.numCuenta=numCu;
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;

    }

    @Override
    public void interesGanado() {
        if (capInvert >= 700 && capInvert <= 1000) {
            interesanual = 0.04;
            interesganado = (capInvert * interesanual) * plazoInv;

        } else if (capInvert >= 2000 && capInvert <= 4000) {
            interesanual = 0.10;
            interesganado = (capInvert * interesanual) * plazoInv;
        } else if (capInvert > 4500) {
            interesanual = 0.15;
            interesganado = (capInvert * interesanual) * plazoInv;
        }
    }

}
