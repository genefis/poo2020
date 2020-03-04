package herenciaautomotriz;

public class Administrativos extends RegistroFC{
    private  double sueldoMensual;
    private double sueldoQuinAd;

    public Administrativos(double SueldoMensual,String nombre,  String dep, String pues ){
        this.sueldoMensual = SueldoMensual;
        this.nombre = nombre;
        this.departamento =  dep;
        this.puesto = pues;
    }

    /**
     * Metodo para calcular el sueldo del Administrador
     */
    public void calcularQuinA(){
        sueldoQuinAd =  sueldoMensual /2;

    }

    /**
     * Metodo para obtener el valor de la variable SueldoMensual
     * @return sueldoMensual
     */
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    /**
     * Metodo para actualizar  el valor de la variable SueldoMensual
     * @param sueldoMensual
     */
    public void setSueldoMensual(double sueldoMensual) {
        sueldoMensual = sueldoMensual;
    }

    public double getSueldoQuinAd() {
        return sueldoQuinAd;
    }

    public void setSueldoQuinAd(double sueldoQuinAd) {
        this.sueldoQuinAd = sueldoQuinAd;
    }
}
