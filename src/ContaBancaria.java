public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void Depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito feito como sucesso !");
        } else {
            System.out.println("O deposito não foi concluido.Tente novamente!");
        }

    }

    public void Sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque feito como sucesso !");
        } else {
            System.out.println("O Saque não foi concluido.Tente novamente!");
        }
    }

    public void ExibirSaldo() {
        System.out.println("saldo atual R$ : " + saldo);

    }

}