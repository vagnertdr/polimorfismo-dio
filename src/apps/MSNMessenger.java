package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensangem pelo Msn Messenger");

    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem");
    }

    @Override
    public void receberMensagem() {
        salvarHistoricoMensagem();
        System.out.println("Recebendo mensagem pelo Msn Messenger");
    }
}
