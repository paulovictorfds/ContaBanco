import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência:");
    String agencia = sc.nextLine();

    System.out.println("Agora, digite o NÚMERO da conta:");
    int numero = Integer.parseInt(sc.nextLine());

    System.out.println("À seguir, digite o NOME do cliente:");
    String nomeCliente = sc.nextLine();

    System.out.println("Por último, digite o SALDO da conta:");
    double saldo = Double.parseDouble(sc.nextLine());
    System.out.println();
    sc.close();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência"
        + " é %s, conta %d e seu saldo %.2f já está disponível para saque.",
        nomeCliente, agencia, numero, saldo);
  }
}