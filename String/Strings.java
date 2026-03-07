public class Strings {
    public static void main (String[] args){

        System.out.println("Clase String");

        //Cadena de texto.
        String name = "Jesús";
        var surname = new String("Navarrete");

        //Operaciones básicas
        // Concatenación utilizando +

        System.out.println(name + " " + surname);

        //Recorre la lista nos dice cuantos carcateres tiene la cadena
        System.out.println(name.length());

        //Indices en un String utilizando .charAt()
        System.out.println(name.charAt(1));

        //Indice recorriendo desde el reverso
        System.out.println(name.charAt(name.length() - 1));

        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Comprobar si contiene .contains(); entre parentecis colocar que es lo que estamos buscando
        System.out.println("hola mundo".contains("lola"));
        System.out.println("Hola mundo".contains("mundo"));

        //Comparar el objeto completo .equals()
        // Importante validar si contiene mayusculas o minusculas o asentos.

        System.out.println(name.equals("Jesús"));
        System.out.println(name.equals("Jesus"));

        //Ignora si contiene mayusculas y minusculas

        System.out.println(name.equalsIgnoreCase("jesús"));

        //Trim elimina espacios al final y al principio
        System.out.println(" Hola mundo ".trim());
        System.out.println(" Hola mundo ");

        //remplace elimina caracteres primero colocamos en viejo y despues el nuevo
        System.out.println(" Hola  soy goku ".replace("goku", "spider-man"));

        //formant
        int age = 25;
        System.out.println(String.format("hola , %s. Tengo %d", name, age));



    }
}