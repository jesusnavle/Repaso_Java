package Conditionals;

public class Conditionals{
    public static void main(String[] args) {
        System.out.println("Condicionales");

        var age = 18;

        if (age > 18){
            System.out.println("Es mayor de edad:" + age);
        } else if(age == 18) {
            System.out.println("El  usuario acaba de cumplir 18");
        }else{
            System.out.println("El usuario no es menor de edad");
        }

        // switch

        var day = 6;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Jueves");
                break;
            default:
                System.out.println("No es ningun dia");
        }
    }

}