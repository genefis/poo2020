package herencia;

public class Estudiante {
    //Atributops de esta clase

    private String carrera;
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void matricular() {
        System.out.println("metodo para matricular");
    }
    public void aprender () {
        System.out.println("metodo para aprender");
    }
}
