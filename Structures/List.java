package Structures;

import java.util.ArrayList;

public class List {
    public static void main (String[] args){
        System.out.println("Listas");

        //Permite almacenar elementos, es mas dinamico no tenemos que almacenar 
        // el tamaño fijo.

        // Declaracicón y creación

        ArrayList<String> names = new ArrayList<>();
        var number = new ArrayList<Integer>();

        //Tamaño 
        System.out.println(names.size());

        // Añadir elementos

        names.add("Jesús");
        names.add("Navarrete");
        names.add("irons");

        System.out.println(names.size());

        //Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar elemntos
        names.set(2, "i@i");

        System.out.println(names.getLast());

        //eliminar
        System.out.println(names.size());

        names.remove(2);

        System.out.println(names.size());

        //Buscar elementos

        System.out.println(names.contains("Jesús"));
        System.out.println(names.contains("irons"));
        
        //Limpiar ArrayList / eliminar todo

        System.out.println(names);
        names.clear();
        System.out.println(names.size());

        


    }
}