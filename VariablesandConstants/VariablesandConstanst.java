public class VariablesandConstanst {

    public static void main (String[] args){
        System.out.println("Este es un programa para definir variables");

        // Importante definir cualquier tipo de dato para que fúncione el programa.

        // tipo de dato -- nombre de variable -- valor
        // tipo de dato cadena/String ---- Secuencia de cadenas
        String name = "Jesus";
        System.out.println(name);

        //Cambio en el valor de la variable
        name = "Alan";
        System.out.println(name);

        int age = 25; //tipo de texto entero (número).
        System.out.println(age);

        var email = "j@j";
        System.out.println(email);


        //Constantes 


        // Palabra rervada en java para una constante es final.
        /*
         Buena practica en constantes declarar el nombre de la variable en Mayusculas 
        */

        final String EMAIL = "jesus@gmail.com";
        
        System.out.println(EMAIL);
    }
    
}