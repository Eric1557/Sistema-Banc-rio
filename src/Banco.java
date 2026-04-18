import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaBancaria> contas;

    public Banco(List<ContaBancaria> conta) {
        this.contas = new ArrayList<>();
    }

    public void AdcionarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta adcionada com sucesso !");
    }

    public ContaBancaria BuscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }

        }
        return null;
    }

}
