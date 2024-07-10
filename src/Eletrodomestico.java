public abstract class Eletrodomestico {
    private boolean ligado;

    public Eletrodomestico() {
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
