package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem");

    }

    @Override
    public void receberMensagem() {
        salvarHistoricoMensagem();
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

}
