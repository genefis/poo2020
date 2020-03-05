package polimorfismoautomotriz;

public class Mecanicos extends RegistroFC {
    private int numTrabajos;
    private double cuotaTra;

    public Mecanicos(String nombre, String dep, String pues, int numTrabajos, double cuotaTra) {
        this.nombre = nombre;
        this.departamento = dep;
        this.puesto = pues;
        this.numTrabajos = numTrabajos;
        this.cuotaTra = cuotaTra;
    }
    @Override
    public void Calcularquincenal() {
        sueldo = 0;
        for (int i = 0; i < numTrabajos; i++) {
            sueldo = cuotaTra * 0.04;

        }
    }

    public int getNumTrabajos() {
        return numTrabajos;
    }

    public double getCuotaTra() {
        return cuotaTra;
    }
}

