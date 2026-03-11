import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira 3: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média foi: " + media);

        if (media >= 6) {
            System.out.println("Parabéns, APROVADO!");
        } else if (media >= 5) {
            System.out.println("Você está de REFORÇO.");
        } else {
            System.out.println("REPROVOU.");
        }

        leitor.close();
    }
}