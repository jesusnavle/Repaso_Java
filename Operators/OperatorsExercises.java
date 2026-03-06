public class OperatorsExercises {
    public static void main (String[] args){
        System.out.println("Ejercicios con Operadores");

        // 1. Crea una variable con el resultado de cada operación aritmética.

        System.out.println("Operadores aritméticos");
        float a = 5;
        float b = 6;

        float suma = a + b;
        System.out.println(suma);

        float resta = a - b;
        System.out.println(resta);

        float mult = a * b;
        System.out.println(mult);

        float div = a / b;
        System.out.println(div);

        float modulo = a % b;
        System.out.println(modulo);

        // 2. Crea una variable para cada tipo de operación de asignación.

        System.out.println("Operadores de asignación");
        
        System.out.println("el valor de a = " + a);

        float aumento = a += 1;
        System.out.println(aumento);

        float decremento = a -= 1;
        System.out.println(decremento);

        float asig_mul = a *= 2;
        System.out.println(asig_mul);

        float asig_div = a *= 2;
        System.out.println(asig_div);

        double asig_mod = a %= 2;
        System.out.println(asig_mod);
        
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(7 < 10);
        System.out.println(3 >= 3);
        System.out.println(1 < 14);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(1 > 3);
        System.out.println(2 >= 7);
        System.out.println(1 < -1);

        // 5. Utiliza el operador lógico and.

        System.out.println(1 > 4 && 5 < 3);


        // 6. Utiliza el operador lógico or.

        System.out.println(1 < 1 || 1 > 3);


        // 7. Combina ambos operadores lógicos.
        System.out.println(1 > 4 && 5 < 3 || 1 > 4 && 5 < 3);


        // 8. Añade alguna negación.

        System.out.println(!(5 > 7 || 2 > 7));


        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--a);


        // 10. Combina operadores aritméticos, de comparación y lógicos.

        System.out.println(a + b < b + b || b - b >= a + a);
    }
}