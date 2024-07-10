public class Testeex4 {
    public static void main(String[] args) {
        Empregado empregadoCLT = new EmpregadoCLT("bia oliveira", "123.456.789-00", 3500.00);
        Empregado empregadoComissionado = new Empregadocomissionado("alice costa", "987.654.321-00", 20000.00, 10);
        Empregado empregadoHorista = new Empregadohorista("ricardo oliveira", "456.789.123-00", 50.00, 40);

        System.out.println(empregadoCLT);
        System.out.println(empregadoComissionado);
        System.out.println(empregadoHorista);
    }
    }

