public class DataTypes {
    public static void main (String[] args){
        System.out.println("Tipos de datos");

        //Tipos de datos Primitivos.
        /*
            int - Entero
            double - Dato en decimal
            float
            long
            bit
            char - un solo caracter / se coloca con una sola comilla
            boolean - Verdadero y falso / true y false
        
         */

        //Tipo de dato int/número entero.

        int Myint = 25;
        System.out.println(Myint);

        double mydouble = 25.3;
        System.out.println(mydouble);

        char mychar = 'a';
        System.out.println(mychar);

        boolean myboolean = true;
        System.out.println(myboolean);

        myboolean = false;
        System.out.println(myboolean);

        // Tipo de dato en tiempo de ejecución 

        String myString = "hola";

        System.out.println(myString.getClass().getSimpleName());
    }
}