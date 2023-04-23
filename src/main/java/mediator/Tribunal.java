package mediator;

public class Tribunal implements OrgaoJudiciario {

    private static Tribunal instancia = new Tribunal();

    private Tribunal() {}

    public static Tribunal getInstancia() {
        return instancia;
    }

    public String receberProcessoLegal(String mensagem) {
        return "O tribunal aceitou e irá iniciar os trâmites para a solicitação: " + mensagem;
    }

    public String receberRepresentacaoLegal(String mensagem) {
        return "O tribunal não encontrou nenhuma irregularidade à respeito do pedido: " + mensagem;
    }

}
