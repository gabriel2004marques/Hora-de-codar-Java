import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Double n1, n2, resultado;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número :");
        n1 = in.nextDouble();

        System.out.println("Escreva outro número :");
        n2 = in.nextDouble();

         while(n2 <= 0) {
           System.out.println("Por favor , escreva um número maior que 0 :");
           n2 = in.nextDouble();
       }

       resultado = n1 + n2;

       System.out.println("O resultado da somo entre os números "+n1+" e "+n2+" é igual a : "+resultado);
}
}