public class Operators {
    public static void main (String[] args){
        System.out.println("Operadores");

        //Operadores básicos

        //Operadores aritméticos

        /* 
            + suma
            - resta
            * multiplicación
            / división
            % modulo (El resultado de la operación/ loque nos sobra del resultado de la operación)
        */

        var a = 5;
        var b = 6;

        System.out.println("Suma");
        System.out.println(a + b);

        System.out.println("Resta");
        System.out.println(a - b);

        System.out.println("Multiplicación");
        System.out.println(a * b);

        System.out.println("División");
        System.out.println(a / b);


        //Operadores de Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 2;
        System.out.println(a);
        
        a %= 2;
        System.out.println(a);

        // Comparación y Relacionales

        // Comparar si son iguales
        System.out.println(a == b);
        System.out.println(a == 0);

        // Diferentes / desigualdad
        System.out.println(a != b);

        // Mayor que
        System.out.println(a > b);

        //Mayor o igual que
        System.out.println(a >= b);

        //Menor que

        System.out.println(a < b);

        //Menor o igual que
        System.out.println(a <= b);


        // Operadores lógicos
        /*
            && (AND)
            || (OR)
            ! (NOT)


        */

        // Y & (AND)
        System.out.println("Operador logico AND (&&)");

        System.out.println(true &&  true);
        System.out.println(true &&  false);
        System.out.println(false &&  true);
        System.out.println(false &&  false);

        System.out.println(3 > 2 && 5 == 2);

        System.out.println("Operdor lógico OR ( || )");

        System.out.println(true ||  true);
        System.out.println(true ||  false);
        System.out.println(false ||  true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        System.out.println("Operador lógico NOT ( ! )");

        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2 || 5 == 2));

        //Unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++); // auto incremento
        System.out.println(--b);
        System.out.println(b--);













    }
}