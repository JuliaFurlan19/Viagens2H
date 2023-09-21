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
        if(Validacao.cpf(cpf)){
            outroTurista.setCpf(cpf);
        } else {
            System.out.println("CPF não validado!");
        }

        JOptionPane.showMessageDialog(null, outroTurista.getCpf() + "validado!");

    }
}