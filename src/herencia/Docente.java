package herencia;

public class Docente {
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void ensenar() {
        System.out.println("Metodo para ensenar");
    }
    public void  calificar() {
        System.out.println("metodo para matricular");
    }
}
