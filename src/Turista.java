public class Turista {
     private String nome;
     private String cpf;

    public String viajar() {
         return "Viajando...";
     }

     Turista() {

     }

     Turista(String nome) {
        nome = this.nome;
     }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
