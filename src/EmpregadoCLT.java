public class EmpregadoCLT extends Empregado{
    private double salarioMensal;

    public EmpregadoCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double rendimentos() {
        return salarioMensal;
    }
    @Override
    public String toString() {
        return super.toString() + ", Salário Mensal: R$ " + salarioMensal + ", Rendimentos: R$ " + rendimentos();
    }



}
