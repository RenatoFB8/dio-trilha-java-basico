package IPhone;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina '" + url + "'.");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    public void tocar() {
        System.out.println("Tocando musica.");
    }

    public void pausar() {
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A musica '" + musica + "' foi selecionada.");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o numero '" + numero + "'.");
    }

    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

}
