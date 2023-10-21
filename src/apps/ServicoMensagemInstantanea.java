package apps;

public abstract  class ServicoMensagemInstantanea {
    public abstract  void enviarMensagem();
    public abstract void receberMensagem();

    // Somente os filhos conhecem este método
    public abstract  void salvarHistoricoMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

}
