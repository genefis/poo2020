package Disenopoo;

public class Validar {
    private String nombre;
    private String materia;
    private Double B1;
    private Double B2;
    private Double nota_final;

    public Validar(String nombre, String materia, Double B1, Double B2){
      this.setNombre(nombre);
      this.setMateria(materia);
      this.setB1(B1);
      this.setB2(B2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getB1() {
        return B1;
    }

    public void setB1(Double b1) {
        B1 = b1;
    }

    public Double getB2() {
        return B2;
    }

    public void setB2(Double b2) {
        B2 = b2;
    }
    public double nota_final() {
        nota_final = B1+B2;
        return nota_final;
    }
    public String validar (){
        String mensaje ="";

        if (nota_final>=28){
            mensaje = "Aprobado";

        }else{
            mensaje="No Aprobado: Debe presentarde a supletorios";

            
        }
        return mensaje;
    }
    public void presentar_estudiante(){
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("MATERIA: "+getMateria());
        System.out.println("BIMESTRE 1: "+getB1());
        System.out.println("BIMESTRE 2: "+getB2());
        System.out.println("NOTA FINAL: "+nota_final());
        System.out.println("ESTADO: "+validar());

    }
}
