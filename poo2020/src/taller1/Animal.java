package taller1;

public class Animal {

    private String nombre;
    private int edad;
    private String raza;
    private String tamano;

    /**
     *
     * @return
     */
    public int  getedad() {
        return edad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getRaza() {
        return raza;
    }

    /**
     *
     * @return
     */
    public String getTamano() {
        return tamano;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int  edad) {
        this.edad = edad;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     *
     * @param tamano
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public String ficha_animal() {
        String ficha = nombre + ":"+raza+":"+tamano+":"+edad;
        return ficha;
    }
}
