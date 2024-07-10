public class Empregadohorista extends Empregado{
    private double salarioPorHora;
    private double horasSemanais;

    public Empregadohorista(String nome, String cpf, double salarioPorHora, double horasSemanais) {
        super(nome, cpf);
        this.salarioPorHora = salarioPorHora;
        this.horasSemanais = horasSemanais;
    }

    @Override
    public double rendimentos() {
        return salarioPorHora * horasSemanais * 4; // 4 semanas em um mês
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário por Hora: R$ " + salarioPorHora + ", Horas Semanais: " + horasSemanais + ", Rendimentos: R$ " + rendimentos();
    }
}
