public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.verStatus();

        smartTv.apertarBotaoPower();

        smartTv.aumentarVolume();

        smartTv.escolherCanal(13);

        smartTv.verStatus();
    }
}
