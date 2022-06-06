import java.util.Scanner;

public class Circulo{

    public static void main(String[] args){
        Double area, raio;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o raio de um circulo :");
        raio = in.nextDouble();

        area = 3.14*(raio*raio);

        System.out.println("A area desse circulo é igual a : "+area);
    }
}