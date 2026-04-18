import java.util.InputMismatchException;
import java.util.Scanner;

public class AppBancario {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco(null);
        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("Bem vindos ao sistema Bancário:\n");
        while (true) {

            System.out.println("Digite 1 para criar uma conta:");
            System.out.println("Digite 2 para deposito:");
            System.out.println("Digite 3 para saque:");
            System.out.println("Digite 4 para exibir Saldo:");
            System.out.println("Digite 5 para sair:");
            System.out.println("Digite uma opção:");
            try{
            op = sc.nextInt();
            sc.nextLine();

            } catch(InputMismatchException e){
                System.out.println("Entrada inválida digite apenas números !");
                sc.nextInt();
                continue;

            }
                
            switch (op) {

                case 1:
                    System.out.println("Digite o numero da conta: ");
                    int numeroConta = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o Titular da conta:");
                    String titular = sc.nextLine();
                    banco.AdcionarConta(new ContaBancaria(numeroConta, titular));
                    break;

                case 2:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = sc.nextInt();
                    ContaBancaria conta = banco.BuscarConta(numeroConta);

                    if (conta != null) {
                        System.out.println("digite o valor do deposito: ");
                        int valor = sc.nextInt();
                        conta.Depositar(valor);
                    } else {
                        System.out.println("conta não encontrada!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = sc.nextInt();
                    ContaBancaria conta1 = banco.BuscarConta(numeroConta);
                    if (conta1 != null) {
                        System.out.println("Digite o valor do saque: ");
                        int valor2 = sc.nextInt();
                        conta1.Sacar(valor2);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = sc.nextInt();
                    ContaBancaria conta2 = banco.BuscarConta(numeroConta);
                    if (conta2 != null) {
                        conta2.ExibirSaldo();
                    } else {
                        System.out.println("Conta não encontrada.");
                    }

                    break;

                case 5:
                    System.out.println("Obrigado por usar o Sistema Bancário ! Saindo.......");
                    sc.close();
                    return;

                default:
                    System.out.println("Esta opção não é válida");

            }

        }
    }
}
