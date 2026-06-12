public class Produto2 {
    import java.util.Scanner;

    Public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Cadastro do produto" + (i + 1));
            
            System.ou.print("Código: ");
            int codigo = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Categoria ");
            String categoria = sc.nextLine();
            
            System.out.print("Preço: ");
            double preco = sc.double();

            System.out.print("Quantidade em Estoque: ");
            int quantidadeEstoque = sc.nextInt();

            System.out.print("Disponivel (true/false): ");
            boolean disponivel = sc.nextBoolean();
            
            produtos[i] = new Produto(
                codigo,
                nome,
                categoria, 
                preco, 
                quantidadeEstoque, 
                disponivel
            );
        }

        System.out.println(\n===== RESULTADOS =====);
        
        for(int i = 0; i <2; i++) {

            produtos[i].exibirDados();

            if(produtos[i].podeSerVendido()) {
                System.out.println("Pode ser vendido.");
            } else {
                System.out.println("Não pode ser vendido.");
            }

            if(produtos[i].podeReceberDesconto()) {
                System.out.println("Pode receber desconto.");
            } else {
                System.out.println("Não pode receber desconto.");
            }
            System.out.println("-----------------------");
        }
        sc.close();
    }
}
