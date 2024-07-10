public abstract class Empregado {
    protected String nome;
    protected String cpf;

    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double rendimentos();

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
