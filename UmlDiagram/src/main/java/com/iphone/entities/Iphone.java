package main.java.com.iphone.entities;

public class Iphone extends Telefone{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " do iphone");
    }

    @Override
    public void atender() {
        System.out.println("IOS atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("IOS iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina em " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }

    @Override
    public void pausar() {
        System.out.println("MusicaPausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica da vez: " + musica);
    }
}
