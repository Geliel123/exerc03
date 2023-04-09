import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double num1;
        double num2;
        double soma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = teclado.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = teclado.nextDouble();

        soma = num1 + num2;

        System.out.println("valor igual a: " + soma);
    }
}