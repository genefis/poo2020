package taller1;

public class Ejecutar_Taller1 {
    public static void main(String[] args) {
        //creacion de objeto tiempo
        Animal animal = new Animal();
        animal.setEdad(5);
        animal.setNombre("Hachi");
        animal.setRaza("Cholo");
        animal.setTamano("mediano");
        String  mostrar_animal =animal.ficha_animal();
        System.out.println(mostrar_animal);
        Celular celular = new Celular();
        Estudiante estudiante = new Estudiante();
        estudiante.setCedula("1105894917");
        

    }
}
