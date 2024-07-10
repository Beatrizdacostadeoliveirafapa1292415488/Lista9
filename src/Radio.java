public class Radio extends Eletrodomestico implements ControleRemoto {
    @Override
    public void ligar() {
        if (!isLigado()) {
            setLigado(true);
            System.out.println("Radio: Rádio ligado.");
        } else {
            System.out.println("Radio: Rádio já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (isLigado()) {
            setLigado(false);
            System.out.println("Radio: Rádio desligado.");
        } else {
            System.out.println("Radio: Rádio já está desligado.");
        }
    }
}
