package Funtions;

import java.util.ArrayList;
import java.util.Arrays;


public class Funtions{
    public static void main(String[] args){

        //funciones

        for (int i = 0; i < 5; i++){
            sendEmail();
        }

        sendEmail();

        sendEmailToUser("irons@irons");

        sendEmailToUser("irons@i", "jesus");

        var users = new ArrayList<>(Arrays.asList("hola@", "jesus@", "si@"));
        sendEmailToUser(users);

        var state = sendEmailWithState("irons@irons");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));



    }

    //Función de parametros sin retorno
    public static void sendEmail(){
        System.out.println("Enviar email");
    }

    //Función con parametros

    public static void sendEmailToUser(String email){
        System.out.println("Se envia el email a " + email);
    }

    //Sobrecarga - cuando se utiliza el mismo nombre de la variable
    //  pero con parametros diferetes.

    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envia el email a " + email + " " + name);
    }

    public static void sendEmailToUser(ArrayList<String> emails){
        for (String email:emails){
            System.out.println("Se envía email a " + email);
        }
    }

    //Funciones con retorno

    public static boolean sendEmailWithState(String email){

        if (email.isEmpty()){
            return false;
        }
        System.out.println("Se envia un email " + email);

        return true;

    }
}