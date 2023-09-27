import java.util.Scanner;
public class ContaBanco {

    public static void main(String[] args) {
        try (// Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in)) {
          
          // Solicitação ao usuário 
          System.out.print("Por favor, digite o número da sua conta: ");
          int numeroConta = scanner.nextInt();
          scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta

          System.out.println();

          // Solicitação ao usuário 
          System.out.print("Por favor, digite o seu nome: ");
          String nomeTitular = scanner.nextLine();

          System.out.println();

          // Solicitação ao usuário 
          System.out.print("Por favor, digite o seu saldo: ");
          double saldo = scanner.nextDouble();

          System.out.println();

          ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

          System.out.println("Informacoes:");

          System.out.println();

          // Imprimindo as informações da conta usando o objeto criado acima.
          System.out.println("Conta: " + conta.numero);
          System.out.println("Titular: " + conta.titular);
          System.out.println("Saldo: R$ " + conta.saldo);
        }
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
