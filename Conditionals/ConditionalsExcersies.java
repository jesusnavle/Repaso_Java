package Conditionals;

public class ConditionalsExcersies {
    public static void main (String[] args) {
        System.out.println("Ejercisios de Condiciones");

        // 1. Estabñece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        
        var edad_user = 24;

        if (edad_user >= 18){
            System.out.println("el usario puede votar su edad es:" + edad_user);
        }else{
            System.out.println("el usuarion no es mayor de edad" + edad_user);
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        var num1 = 15;
        var num2 = 15;

        if (num1 > num2){
            System.out.println("el número mayor es: " + num1);
        } else if (num1 < num2){
            System.out.println("En múmero mayor es: " + num2);
        } else if (num1 == num2){
            System.out.println("Los números son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        num1 = 1;

        if (num1 < 0){
            System.out.println("El numero es negativo.");
        }else if(num1 > 0){
            System.out.println("El númereo es positivo");
        }else if(num1 == 0){
            System.out.println("El número es 0");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        // 5. Verifica si un número está en el rango de 1 a 100.

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
    }
    
}
