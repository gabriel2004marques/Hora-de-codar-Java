import java.util.Scanner;

public class Quadrado{

    public static void main(String[] args){
        Double area, lado;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o lado de um quadrado :");
        lado = in.nextDouble();

        area = lado*lado;

        System.out.println("A area desse quadrado é igual a : "+area);
    }
}
