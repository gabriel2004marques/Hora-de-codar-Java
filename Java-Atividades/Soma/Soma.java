import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
    Double n1, n2, n3;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número :");
    n1 = in.nextDouble();

    System.out.println("Digite outro número :");
    n2 = in.nextDouble();

    System.out.println("Digite mais um número :");
    n3 = in.nextDouble();

    if(n1 < n2 && n1 < n3) {
        System.out.println("Os maiores são "+n2+" e "+n3+" e a soma entre esse números é igual a : "+(n2 + n3));
    }
    if(n2 < n1 && n2 < n3) {
        System.out.println("Os maiores são "+n1+" e "+n3+" e a soma entre esse números é igual a : "+(n1 + n3));
    }
    if(n3 < n1 && n3 < n2) {
        System.out.println("Os maiores são "+n1+" e "+n2+" e a soma entre esse números é igual a : "+(n2 + n1));
    }
    }
}