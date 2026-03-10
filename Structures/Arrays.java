package Structures;

public class Arrays{
    public static void main (String[] args){
        System.out.println("Arreglos");

        // Conjunto de tipos de datos del mismo tipo / Indexado

        //Decalaración y creación 
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Jesús", "Navarrete", "irons"};
        System.out.println(names);

        //Acceder a datos
        System.out.println(names[0]);

        //Crear array directo pero sin ningun dato.

        System.out.println((new String[3])[0]);

        //Modificación

        numbers[0] = 1;
        numbers[1] = 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //Modificaciones con string

        System.out.println(names[2]);
        names[2] = "1@i";
        System.out.println(names[2]);
        

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
   




    }
}