package entidades;

import interfaces.Aparelho;
import interfaces.Navegador;
import interfaces.Reprodutor;

public class Iphone implements Aparelho, Navegador, Reprodutor {


    @Override
    public void realizarChamada(String numero) {
        System.out.println("realizando chamada para " + numero);
    }

    @Override
    public void desligarChamada() {
        System.out.println("desligando chamada ");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("recebendo chamada de " + numero);
    }

    @Override
    public void receberSms(String numero) {
        System.out.println("recebendo sms de " + numero);
    }

    @Override
    public void enviarSms(String numero) {
        System.out.println("enviando sms para " + numero);
    }

    @Override
    public void abrirAba(String link) {
        System.out.println("abrindo aba com o link " + link);
    }

    @Override
    public void fecharAba() {
        System.out.println("fechando aba ");
    }

    @Override
    public void buscarSites(String busca) {
        System.out.println("realizando busca para " + busca);
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("tocando " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("pausando musica ");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionando musica " + musica);
    }
}
