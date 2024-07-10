public class Testeex1 {
    public static void main(String[] args) {
        ControleRemoto tvModelo1 = new Modelo1() {
            @Override
            public void ligar() {

            }

            @Override
            public void desligar() {

            }
        };
        ControleRemoto tvModelo2 = new Modelo2();
        ControleRemoto radio = new Radio();

        tvModelo1.ligar();
        tvModelo1.desligar();


        tvModelo2.ligar();
        tvModelo2.desligar();


        radio.ligar();
        radio.desligar();
    }
    }

