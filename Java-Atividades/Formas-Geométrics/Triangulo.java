import java.util.Scanner;

public class Triangulo{

    public static void main(String[] args){
        Double base, h, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a base de um triangulo :");
        base = in.nextDouble();

        System.out.println("Agora escreva a altura desse triangulo :");
        h = in.nextDouble();

        area = (base*h)/2;

        System.out.println("A area desse triangulo é igual a : "+area);
    }
}