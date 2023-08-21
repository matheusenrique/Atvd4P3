package atvd4;
import java.util.Scanner;
public class Question18 {
    /*Peça ao usuário que insira o seu estado civil e, usando a estrutura switch/case, exiba uma
mensagem informando se é solteiro, casado, divorciado ou viúvo. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira seu estado civil: ");
        String estadoCivil = s.nextLine();
        switch(estadoCivil) {
            case "Solteiro":
                System.out.println("Você é solteiro.");
                break;
            case "Casado":
                System.out.println("Você é casado");
                break;
            case "Divorciado":
                System.out.println("Você é divorciado");
                break;
            case "Viúvo":
                System.out.println("Você é viúvo");
                break;
            default:
                System.out.println("Insira um estado civil válido");
                break;
        }
    }
}
