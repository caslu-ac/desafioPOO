import entidades.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.abrirAba("www.google");

        iphone.buscarSites("google");

        iphone.fecharAba();

        iphone.receberSms("99999999");

        iphone.enviarSms("99999999");

        iphone.receberChamada("99999999");

        iphone.realizarChamada("9*99999999");

        iphone.desligarChamada();

        iphone.selecionarMusica("musica test");

        iphone.tocarMusica("musica test");

        iphone.pausarMusica();
    }
}