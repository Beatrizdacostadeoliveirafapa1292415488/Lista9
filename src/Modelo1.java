public abstract class Modelo1 extends Eletrodomestico implements ControleRemoto{
    private boolean ligado;

    public Modelo1() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public abstract void ligar();
    public abstract void desligar();
}
