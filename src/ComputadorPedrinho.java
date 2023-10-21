import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

       /* nao se sabe qual APP
        mas qualquer um deverá Enviar e Receber mensagens
        */

        String appEscolhido="tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();


    }
}
