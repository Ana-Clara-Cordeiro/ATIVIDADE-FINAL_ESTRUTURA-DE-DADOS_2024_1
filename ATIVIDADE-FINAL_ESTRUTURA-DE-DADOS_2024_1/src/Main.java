import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        // Cadastro de clientes:
        supermercado.adicionarCliente("12345678901", "Ana Clara Cordeiro", "(85) 98765-4321", "cordeiro.anaclara263@gmail.com");
        supermercado.adicionarCliente("46161612169", "Rebeca Rodrigues", "(85) 98453-5784", "rodriguesrebeca518@outlook.com ");
        supermercado.adicionarCliente("24864156654", "Lucas Lessa", "(85) 98742-6577", "lucaslessa14@hotmail.com");
        supermercado.adicionarCliente("56874526699", "Vitor Costa", "(85) 98874-5578", "Victorcosta030902@gmail.com");

        // Busca de cliente pelo CPF:
        String cpfBusca = "46161612169";
        Cliente clienteEncontrado = supermercado.buscarCliente(cpfBusca);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nome: " + clienteEncontrado.getNome());
            System.out.println("CPF: " + clienteEncontrado.getCpf());
            System.out.println("Celular: " + clienteEncontrado.getCelular());
            System.out.println("Email: " + clienteEncontrado.getEmail());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}