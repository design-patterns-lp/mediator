package mediator;

public class Pessoa {

    public String solicitarProcesso(String mensagem) {
        return EscritorioAdvocacia.getInstancia().receberSolicitacaoMoverProcesso(mensagem);
    }

    public String solicitarRepresentacaoJuridica(String mensagem) {
        return EscritorioAdvocacia.getInstancia().representarJuridicamente(mensagem);
    }


}
