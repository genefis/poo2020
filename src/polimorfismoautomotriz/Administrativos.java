package polimorfismoautomotriz;

public class Administrativos extends RegistroFC {
    private  double sueldoMensual;
        public Administrativos(String nombre,double SueldoMensual, String dep, String pues ){
         this.sueldoMensual = SueldoMensual;

    }
    @Override
    public void Calcularquincenal() {
        sueldo =  sueldoMensual /2;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }


}
