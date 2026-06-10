public class Funcionarioo {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(int id, String  nome, String cargo, double salario) {
        this id = id;
        this nome = nome;
        this cargo = cargo;
        this salario = salario;
        this ativo = ativo;
    }

    public void exibirInformações() {
        System.out.println("ID: " + id);
        System.out.println("Nome:" + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Ativo: " + ativo);
    }

    public boolean podeTrabalhar() {
        return ativo && String.valueOf(id).length() >= 6;
    }

    public boolean podeReceberBonus() {
        return ativo && salario < 5000.00;
    }

}