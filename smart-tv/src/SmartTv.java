public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void apertarBotaoPower() {
        ligada = !ligada;
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 1) {
            volume--;
        }
    }

    public void passarCanal() {
        if (ligada) {
            canal++;
        }
    }

    public void retrocederCanal() {
        if (ligada && canal > 1) {
            canal--;
        }
    }

    public void escolherCanal(int canalEscolhido) {
        if (ligada && canalEscolhido > 0) {
            canal = canalEscolhido;
        }
    }

    public void verStatus() {
        System.out.println("==================");
        System.out.println("Ligada:" + ligada);
        System.out.println("Canal:" + canal);
        System.out.println("Volume" + volume);
        System.out.println("==================");
    }

    public static void main(String[] args) {

    }

}
