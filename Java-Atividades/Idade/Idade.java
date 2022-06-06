import java.util.Scanner;

public class Idade{

    public static void main(String[] args) {

        String nome;
        String idade;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o seu nome ?");
        nome = in.next();

        System.out.println("Olá "+nome+" ! Quantos anos você tem ?");
        idade = in.next();

        System.out.println("Você se chama "+nome+" e tem "+idade+" anos.");
    }
}