public class Main {
    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(258474, "Anna", true);
        Funcionario f2 = new Funcionario(6555655, "Lucas", true);
        f1.exibirDados();
        System.out.println("Pode trabalhar: " + f1.podeTrabalhar());
        System.out.println();

        f2.exibirDados();
        System.out.println("Pode trabalhar: " + f2.podeTrabalhar());
    }
}