public class Cliente {
    private String nome;
    
    void cliente(String nome) {
        this.nome = nome;
    }
    
    public String AcessarNomeCliente() {
        return nome;
    }
    
    public void ModificarNomeCliente(String nome1) {
        nome = nome1;
    }
}