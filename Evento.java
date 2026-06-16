public class Evento {
    private int codigo;
    private String nome;
    private String local;
    private double valorInscricao;
    private int vagasDisponiveis;
    private time cargaHoraria;

    public Evento(int codigo, String nome, String local, double valorInscricao, int vagasDisponiveis, time cargaHoraria) {
        this.codigo = codigo
        this.nome = nome
        this.local = local
        this.valorInscricao = valorInscricao
        this.vagasDisponiveis = vagasDisponiveis
        this.cargaHoraria = cargaHoraria

        public void exibirDados() {
            System.out.println("Código: " + codigo);
            System.out.println("Nome: " + nome);
            System.out.println("Local: " + local);
            System.out.println("Valor de Inscrição: " + valorInscricao);
            System.out.println("Vagas Disponíveis: " + vagasDisponiveis);
            System.out.println("Carga Horária: " + cargaHoraria);
        }

        public void situacaoVagas() {
            if (vagas == 0) {
                System.out.println("Não há vagas disponíveis");
            } else if (vagas < 10) {
                System.out.println("Últimas vagas");
            } else if (vagas <= 30) {
                System.out.println("Vagas moderadas");
            } else {
                System.out.println("Muitas vagas disponíveis");
            }     
        }

        public void verificarDesconto(){
            if(valorInscricao > 300){
                double desconto = valorInscricao * 0.10
                double valorFinal = valorInscricao - desconto

                System.out.println("Desconto de 10% aplicado");
                System.out.println("Valor com Desconto: " + valorFinal);
            }
            else{
                System.out.println("Evento sem desconto promocional.");
            }
        }

        public int getVagasDisponiveis() {
            return vagasDisponiveis;
        }

    }
}