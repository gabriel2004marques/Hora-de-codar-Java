import java.util.Scanner;

public class Paralelogramo{

    public static void main(String[] args){
        Double area, base, h;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a base de um paralelogramo :");
        base = in.nextDouble();

        System.out.println("Agora escreva a altura desse paralelogramo :");
        h = in.nextDouble();

        area = base*h;

        System.out.println("A area desse paralelogramo é igual a : "+area);
    }
}