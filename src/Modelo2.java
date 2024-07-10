public class Modelo2 extends Eletrodomestico implements ControleRemoto {
    @Override
    public void ligar() {
        if (!isLigado()) {
            setLigado(true);
            System.out.println("Modelo2: TV ligada.");
        } else {
            System.out.println("Modelo2: TV já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (isLigado()) {
            setLigado(false);
            System.out.println("Modelo2: TV desligada.");
        } else {
            System.out.println("Modelo2: TV já está desligada.");
        }
    }
}
