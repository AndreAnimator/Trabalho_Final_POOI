import java.io.*;
public class GerenciadorClientesArquivos implements GerenciadorClientes {
    @Override
    public void gravarClientes(String nome) {
        BufferedWriter escritor = null;
		try {
			escritor = new BufferedWriter(new FileWriter("arquivo.txt", true));
			escritor.write(nome);
			escritor.newLine();
		} catch (IOException exc) {
			System.out.println("Erro de I/O" + exc);
		} finally {
			try {
				if (escritor != null)
					escritor.close();
			} catch (IOException exc) {
				System.out.println("Fechando arquivo" + exc);
			}
		}
    }
    @Override
    public void lerClientes(){
        String linha;
		try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException exc) {
			System.out.println("Erro de I/O: " + exc);
		}
    }
}
