package herencia;

public class Administrativo {
    private String dependencia;


    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public void gestionar_personal(){
        System.out.println("sirve para gestionar el personal");
    }
}
