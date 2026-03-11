package Loops;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Loops{
    public static void main(String[] args){
        System.out.println("Loops / Bucles");

        //Nos sirve para ejecutar un mismo bloque de codigo
        // Hasta que nostros queramos hasta que se cumpla una condición.

        //Loops

        // - for
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola Mundo");
        }

        String[] names = {"Jesus", "Navarrete", "Leal"};

        for (int i = 1; i < names.length + 1; i++) {
            System.out.println(names[i - 1]);
        }

        // for-each --- indicado para recorrer un array

        for (String name: names){
            System.out.println(name);
        }

        //recorrer un set

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(Integer number:numbers) {
            System.out.println(number);

        }

        //Regorer mapa/diccionario

        HashMap<String, String> emails = new HashMap<>();
        emails.put("name", "Jesus");
        emails.put("apellido", "Leal");
        emails.put("email", "irons");

        for (Map.Entry<String, String> email : emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());

        }

        //ciclo while

        int index = 0;
        while (index < 5){
            System.out.println("Hola");
            index++;

        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index ++;
        }

        index = 0;
        Boolean find = false;
        while (!find){
            System.out.println(names[index]);
            if (names[index].equals("Navarrete")){
                find = true;
            }
            index++;

        }


        // do-while


        index = 0;
        do {
            System.out.println("Hola");
            index ++;
        } while (index < 5);

        //control de bluces

        // Break - rompe bloques.

        for (String name: names) {
            if (name.equals("Navarrete")){
                break;
            }
            System.out.println(name);
        }

        // continue - continua ciclo

        for(int i = 0; i < 5; i++){
            if (i ==3){
                continue;
            }
            System.out.println(i);
        }

    }

}