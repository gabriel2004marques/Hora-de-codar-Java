import java.util.Scanner;

public class Trapezio{

    public static void main(String[] args){
        Double bM, bm, h, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a base maior de um trapezio :");
        bM = in.nextDouble();

        System.out.println("Agora escreva a base menor desse trapezio :");
        bm = in.nextDouble();

        System.out.println("Agora escreva a altura desse trapezio :");
        h = in.nextDouble();

        area = (bM * bm)*h/2;

        System.out.println("A area desse trapezio é igual a : "+area);
    }
}