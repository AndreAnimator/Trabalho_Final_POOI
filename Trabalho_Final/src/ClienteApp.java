import java.util.ArrayList;
public class ClienteApp {
    public static void main(String[] arg){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Console console = new Console();
        GerenciadorClientesArquivos gerenciador = new GerenciadorClientesArquivos();
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome do cliente nº " + i + ": ");
            clientes.add(new Cliente());
            clientes.get(i).ModificarNomeCliente(console.leString());
            gerenciador.gravarClientes(clientes.get(i).AcessarNomeCliente());
        }
        System.out.println("Imprimindo os nomes: ");
        gerenciador.lerClientes();
    }
}
