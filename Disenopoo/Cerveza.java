package Disenopoo;

public class Cerveza {
    private double precio;
    private int unidades;
    private String nombre;
    private String tipo;
    public Cerveza (double precio , int unidades, String nombre, String tipo){
      this.precio=precio;
      this.unidades=unidades;
      this.nombre=nombre;
      this.tipo=tipo;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double total_ventas() {
        double ventas = precio*unidades;
        return ventas;
    }
    public void presentar (){
        System.out.println("CERVEZA:    "+getNombre());
        System.out.println("TIPO:       "+getTipo());
        System.out.println("UNIDADES:   "+getUnidades());
        System.out.println("COSTO UNITARIO:  " +getPrecio());
        System.out.println("TOTAL VENTAS:   $"+total_ventas()+"dolares");
    }
}
