package datosTipoObjeto;

import java.util.ArrayList;
import java.util.List;

public class EjemplosLista {
    public static void main(String[] args) {
        //creacion de una lista en java
                //para almacena valores de tipo STring
                List<String> universidades= new ArrayList<String>();
                universidades.add("UTPL");
                System.out.println("tamano de la lista es \t"+universidades.size());
                universidades.add("Espol");
                System.out.println("tamano de la lista es \t"+universidades.size());
                universidades.add("UNL");
                System.out.println("tamano de la lista es \t"+universidades.size());
                //universidades.remove(1);
                System.out.println("tamano de la lista es \t"+universidades.size());
                //recorremos lista para presentar valores
                // remplazar un valor
                universidades.set(1,"CENTRAL");
                universidades.add(1,"Nasa");
        for (String univ:universidades) {
            System.out.println(univ);
        }

    }


}


