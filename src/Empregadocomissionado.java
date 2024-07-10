public class Empregadocomissionado extends  Empregado {
    private double vendasMensais;
    private double percentualComissao;

    public Empregadocomissionado(String nome, String cpf, double vendasMensais, double percentualComissao) {
        super(nome, cpf);
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double rendimentos() {
        return vendasMensais * (percentualComissao / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendas Mensais: R$ " + vendasMensais + ", Percentual Comissão: " + percentualComissao + "%, Rendimentos: R$ " + rendimentos();
    }
}
