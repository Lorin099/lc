import javax.swing.JOptionPane; 

public class Principall {
    public static void main(String[] args) {

        Evento[] eventos = new Evento[3];

        for (int i = 0; i < 3; i++) {
            int codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o codigo do evento:")
            );
            String nome = JOptionPane.showInputDialog(
                "Digite o nome do evento:"
            );
            String local = JOptionPane.showInputDialog(
                "Digite o local:"
            );
            double valorInscricao = JOptionPane.showInputDialog(
                "Digite o valor da inscrição"
            );
            int vagasDisponiveis = JOptionPane.showInputDialog(
                "Digite a quantidade de vagas"
            );
            time cargaHoraria = JOptionPane.showInputDialog(local
                "Digite a carga horária"
            );

            eventos[i] = new Evento(
                codigo, nome, local, valorInscricao, vagasDisponiveis, cargaHoraria
            );
             if (vagas < 10) {
                JOptionPane.showMessageDialog(
                    null,
                    "ATENÇÃO : O evento está com as últimas vagas!", 
                    "ALERTA",
                    JOptionPane.WARNING_MESSAGE
                );
             }

        }
        System.out.println("===== EVENTOS CADASTRADOS =====");

        for (Evento evento : eventos) {`
            evento.exibirInformacoes();
            evento.verificarVagas();
            evento.situacaoVagas();
            evento.verificarDesconto();
            System.out.println("-----------------------");
        }
    }
}
