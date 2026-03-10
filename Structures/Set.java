package Structures;

import java.util.HashSet;

public class Set{
    public static void main (String[]args){
        System.out.println("Set");

        //Almacena datos unicos y desordenados

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // tamaño

        System.out.println(names.size());

        // Añadir elementos

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        names.add("Jesus");
        names.add("Navarrete");
        names.add("irons");
        names.add("i@i");

        names.remove("Jesus");

        System.out.println(names.size());

        System.out.println(names);

        System.out.println(names.contains("Jes"));

        //names.addAll(numbers); error

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Paris");

        names.addAll(countries);

        names.retainAll(countries);

        System.out.println(names);

        names.removeAll(countries);

        System.out.println(names);


    }
}