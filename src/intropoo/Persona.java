package intropoo;

public class Persona {
    private String genero;
    private String religion;
    private int edad;
    private String nombre;

    /**
     * Este es el contructor
     * @param genero
     * @param religion
     * @param edad
     * @param nombre
     */
    public Persona (String genero, String religion, int edad,String nombre){
        this.genero = genero;
        this.edad= edad;
        this.religion=religion;
        this.nombre=nombre;

    }
    public Persona (String genero, String religion, int edad){
        this.genero = genero;
        this.religion=religion;
        this.nombre=nombre;

    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}



