public class Main {
    public static void main(String[] args) {

        var mochileiro = new Turista();
        mochileiro.setNome("Lohan");
        mochileiro.setCpf(Validacao.cpf("73527958"));

        var mochileira = new Turista("Eliza");
        mochileira.setCpf(Validacao.cpf("794782750"));

        String retorno = mochileira.viajar();
        System.out.println(retorno);
    }
}