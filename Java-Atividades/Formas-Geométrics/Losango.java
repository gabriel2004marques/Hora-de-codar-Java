import java.util.Scanner;

public class Losango{

    public static void main(String[] args){
        Double dM, dm, resultado;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a diagonal maior de um losango :");
        dM = in.nextDouble();

        System.out.println("Agora escreva a diagonal menor de um losango :");
        dm = in.nextDouble();

        resultado = (dM * dm)/2;

        System.out.println("A area desse losango é igual a : "+resultado);
    }
}