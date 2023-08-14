package projeto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String senha = scan.next();

        System.out.println(validatePassword(senha));
    }

    public static String validatePassword(String password) {
        
        //Verifica se a senha e menor que 8
        if (password.length() < 8) {
            return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        }

        //verifica se Sua senha não contém pelo menos uma letra maiúscula (A-Z)
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        //verifica se Sua senha não contém pelo menos uma letra minúscula (a-z)
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        //verifica se Sua senha não contém pelo menos um número (0-9)
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        //verifica Se sua senha não contém pelo menos um caractere especial, como !, @, #, $, %, etc.
        if (!Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?]").matcher(password).find()) {
            return "Sua senha nao atende aos requisitos de seguranca.";
        }

        return "Sua senha atende aos requisitos de seguranca. Parabens!";
    }
}
