public class Funcionario {
    private int matricula;
    private String nome;
    private boolean ativo;
    
    public void Funcionario(int matricula, String nome, boolean ativo) {
        this.matricula = matricula;
        this.nome = nome;
        this.ativo = ativo;
    }
    public void exibirDados() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
    }
    public boolean FuncionarioLiberado() {
        return ativo && String.valueOf(matricula).length() >= 6;
    }
    
} 