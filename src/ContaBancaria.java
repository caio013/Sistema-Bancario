import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Tipo de Conta:");
        String tipoDeConta = leitor.nextLine();

        System.out.println("Insira o saldo inicial da conta:");
        double saldo = leitor.nextDouble();

        System.out.println("==========================================");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println(String.format("Saldo inicial: R$%.2f", saldo));
        System.out.println("==========================================");
    }
}
