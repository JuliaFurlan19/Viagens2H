import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        var mochileiro = new Turista();
        mochileiro.setNome("Lohan");

        var mochileira = new Turista("Eliza");

        String retorno = mochileira.viajar();
        System.out.println(retorno);

        var outroTurista = new Turista();
        String nome = JOptionPane.showInputDialog("Entre com seu nome: ");
        outroTurista.setNome(nome);
        JOptionPane.showMessageDialog(null, "O nome digitado foi: " + outroTurista.getNome());

        String cpf = JOptionPane.showInputDialog("Entre com seu CPF: ");
        if(Validacao.validaCPF(cpf)){
            outroTurista.setCpf(cpf);
            System.out.println("CPF valido!");
        } else {
            System.out.println("CPF não valido!");
        }

        JOptionPane.showMessageDialog(null, outroTurista.getCpf() + " validado!");

    }
}