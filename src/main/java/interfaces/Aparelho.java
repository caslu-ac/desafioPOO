package interfaces;

public interface Aparelho {
    void realizarChamada(String numero);

    void desligarChamada();

    void receberChamada(String numero);

    void receberSms(String numero);

    void enviarSms(String numero);
}
