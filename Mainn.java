public class Mainn {
    public static void main(String[] args) {

        Scanner entrada = new scanner(System.in);

        //Funcioario 1
        System.out,println("=== |Funcionário 1");
        System.out.println("Matrícula: ");
        int matricula1 = entrada.nextInt();
        entrada.nextLine(); //Limpa o enter que ficou pendente

        System.out.println("Nome: ");
        String nome1 = entrada.nextLine();

        System.out.println("Cargo: ");
        String cargo1 = entrada.nextLine();

        System.out.println("Salário: ");
        double salario1 = entrada.nextDouble();

        System.out.println("Ativo (true/false): ");
        boolean ativo1 = entrada.nextBoolean();

        Funcionario funcionario1 = new Funcionario(
            matricula1, nome1, cargo1, salario1, ativo1);

        //Funcionario 2
        System.out.println("=== |Funcionário 2");
        System.out.println("Matrícula: ");
        int matricula2 = entrada.nextInt();
        entrada.nextLine(); //Limpa o enter que ficou pendente

        System.out.println("Nome: ");
        String nome2 = entrada.nextLine();

        System.out.println("Cargo: ");
        String cargo2 = entrada.nextLine();

        System.out.println("Salário: ");
        double salario2 = entrada.nextDouble();

        System.out.println("Ativo (true/false): ");
        boolean ativo2 = entrada.nextBoolean();

        Funcionario funcionario2 = new Funcionario(
            matricula2, nome2, cargo2, salario2, ativo2);   

        //Exibir informações dos funcionários
        System.out.println("\n=== |Informações do Funcionário 1");
        funcionario1.exibirInformações();
        System.out.println("Pode trabalhar? " + funcionario1.podetrabalhar());
        System.out.println("Pode receber bônus? " + funcionario1.podeReceberBonus());
    

        System.out.println("\n=== |Informações do Funcionário 2");
        funcionario2.exibirInformações();
        System.out.println("Pode trabalhar? " + funcionario2.podetrabalhar());
        System.out.println("Pode receber bônus? " + funcionario2.podeReceberBonus());

        entrada.close();
    }

}
