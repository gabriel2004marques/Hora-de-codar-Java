import java.util.Scanner;

public class Nome {

    public static void main(String[] args) {

        String nome;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o seu nome ?");
        nome = in.next();

        System.out.println("Olá "+nome+" ! Seja bem vindo ao servidor !");
    }
}