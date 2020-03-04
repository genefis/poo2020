package polimorfismo_poo;

public  class EmpleadoxPorHora2 extends Empleado12 {
    private double horas_trabajadas;
    private double cuotaPorHora;

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void setCuotaPorHora(double cuotaPorHora) {
        this.cuotaPorHora = cuotaPorHora;
    }

    @Override
    public void CalSueldoQuin() {
        sueldo=(horas_trabajadas*cuotaPorHora);
    }

}
