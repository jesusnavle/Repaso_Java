package Structures;

import java.util.HashMap;

public class Maps{
    public static void main (String[] args){
        System.out.println("Mapas");

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();
        

        //Añandir elementos 

        names.put("nombre", "Jesus");
        names.put("apellido", "Navarrete");
        names.put("email", "irons@email.com");

        System.out.println(names);

        System.out.println(names.size());

        //Acceder Elementos

        System.out.println(names.get("nombre"));

        //Verificar Elementos.

        System.out.println(names.containsKey("nombre"));
        System.out.println(names.containsValue("Navarrete"));

        names.remove("nombre");

        System.out.println(names);

        // Modificar elementos

        names.put("domicilio", "México");
        System.out.println(names);

        names.put("domicilio", "CDMX");
        System.out.println(names);
    }
}