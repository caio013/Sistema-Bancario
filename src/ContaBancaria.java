import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int escolhaOperacao = 0;
        double saldoInicial = 0;
        double saldoFinal = 0;

        System.out.println("Insira seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Tipo de Conta:");
        String tipoDeConta = leitor.nextLine();

        System.out.println("Insira o saldo inicial da conta:");
        saldoInicial = leitor.nextDouble();

        System.out.println("==========================================");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println(String.format("Saldo inicial: R$%.2f", saldoInicial));
        System.out.println("==========================================");

        System.out.println("Operações:");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        while(escolhaOperacao != 4){
            System.out.println("Digite a operação desejada:");
            escolhaOperacao = leitor.nextInt();

            switch (escolhaOperacao){
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = leitor.nextDouble();
                    saldoFinal = saldoInicial + valorReceber;
                    System.out.println(String.format("Saldo atualizado: R$%.2f", saldoFinal));
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir:");
                    double valorTransferir = leitor.nextDouble();
                    saldoFinal = saldoFinal - valorTransferir;
                    System.out.println(String.format("Saldo atualizado: R$%.2f", saldoFinal));
                    break;
                case 1:
                    System.out.println(String.format("O saldo atual é: R$%.2f",saldoFinal));
                    break;
                case 4:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}
