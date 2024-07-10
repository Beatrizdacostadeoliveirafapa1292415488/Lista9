public class Retangulo extends Quadrilatero{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo: base = " + base + ", altura = " + altura + ", área = " + calculaArea() + ", perímetro = " + calculaPerimetro();
    }
}
