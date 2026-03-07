public class StringExercises{
    public static void main (String[] args){
        System.out.println("Ejercicios para strings");
        // 1. Concatena dos cadenas de texto.
        String a = "hola";
        String b = "mundo";

        System.out.println(a + " " + b);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(a.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(a.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println(a.contains("mundo"));

        // 6. Formatea un string con un entero.
        int num = 18;
        System.out.println(String.format("El numero es: %d", num));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        String letras = "  Esto tiene mucho espacio   ";

        System.out.println(letras);
        
        System.out.println(letras.strip());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        System.out.println(letras.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.

        String letras_2 = "  Esto tiene mucho espacio   ";

        System.out.println(letras.equals(letras_2));
        

        // 10. Comprueba si dos strings tienen la misma longitud.

        System.out.println(letras.length() == letras_2.length());

    }
}