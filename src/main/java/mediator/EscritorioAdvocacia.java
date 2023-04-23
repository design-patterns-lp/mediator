package mediator;

public class EscritorioAdvocacia {

    private static EscritorioAdvocacia instancia = new EscritorioAdvocacia();

    private EscritorioAdvocacia() {}

    public static EscritorioAdvocacia getInstancia() {
        return instancia;
    }

    public String receberSolicitacaoMoverProcesso(String mensagem) {
        return "Olá Sr(a) cliente!.\n"+
                "O tribunal respondeu da seguinte forma à solicitação.\n" +
                ">>" + Tribunal.getInstancia().receberProcessoLegal(mensagem);
    }

    public String representarJuridicamente(String mensagem) {
        return "Olá Sr(a) cliente!.\n"+
                "O escritório de advocacia irá representá-lo. Veja a seguir as considerações do tribunal.\n" +
                ">>" + Tribunal.getInstancia().receberRepresentacaoLegal(mensagem);
    }


}
