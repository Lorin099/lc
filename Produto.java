public class Produto {
    private int codigo;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEstoque;
    private boolean disponivel;

    public Produto(int codigo, String nome, String categoria, double preco, int quantEstoque, boolean disponivel) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantEstoque = quantidadeEstoque;
        this.disponivel = disponivel;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Disponível: " + disponivel);
    }

    public boolean podeSerVendido() {
        return quantidadeEstoque > 0;
    }
    public boolean podeReceberDesconto() {
        return disponivel && preco > 100.0;
    }
    
    public boolean quantidadeEmEstoque() {
        return quantidadeEstoque > 0;
    }

    public String verificarEstoque() {
        if (quantidade < 10) {
            return "Estoque baixo";
        } else (
            return "Estoque adequado";
        )
    }
}

