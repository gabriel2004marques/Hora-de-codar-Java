import java.util.Scanner;

public class Retangulo{

    public static void main(String[] args) {
    
    Double area, base, altura;

    Scanner in = new Scanner(System.in);

    System.out.println("Informe a base de um retangulo :");
    base = in.nextDouble();

    System.out.println("Agora informe a altura desse retangulo :");
    altura = in.nextDouble();

    area = base*altura;

    System.out.println("A area desse retangulo é igual a : "+area);
    }
}
