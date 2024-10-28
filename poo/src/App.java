import IPhone.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();

        System.out.println("===========");

        iphone.adicionarNovaAba();
        iphone.exibirPagina("github.com");
        iphone.atualizarPagina();

        System.out.println("===========");

        iphone.selecionarMusica("Musica muito boa - Banda boa");
        iphone.tocar();
        iphone.pausar();

        System.out.println("===========");

        iphone.ligar("99 99999-9999");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        System.out.println("===========");
    }
}
