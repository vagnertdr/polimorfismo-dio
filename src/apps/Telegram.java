package apps;

public class Telegram extends ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem");

    }

    @Override
    public void receberMensagem() {
        salvarHistoricoMensagem();
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
