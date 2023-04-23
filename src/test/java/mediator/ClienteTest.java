package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveSolicitarProcesso() {
        Cliente cliente = new Cliente();
        assertEquals("Olá Sr(a) cliente!.\nO tribunal respondeu da seguinte forma à solicitação.\n" +
                        ">>O tribunal aceitou e irá iniciar os trâmites para a solicitação: Quero processar o Maurício",
                cliente.solicitarProcesso("Quero processar o Maurício"));
    }

    @Test
    void deveSolicitarRepresentacaoJuridica() {
        Cliente cliente = new Cliente();
        assertEquals("Olá Sr(a) cliente!.\nO escritório de advocacia irá representá-lo. Veja a seguir as considerações do tribunal.\n" +
                        ">>O tribunal não encontrou nenhuma irregularidade à respeito do pedido: Solicito representação juridica",
                cliente.solicitarRepresentacaoJuridica("Solicito representação juridica"));
    }

}