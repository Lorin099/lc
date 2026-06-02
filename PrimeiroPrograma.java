public class PrimeiroPrograma {

    public static void main(String[] args) throws InterruptedException {

        for (int etapa = 1; etapa <= 5; etapa++) {

            int bateria = 65;
            if (bateria >=50) {

            switch(etapa) {

                case 1:
                    System.out.println("Sistema Iniciado");
                    Thread.sleep(3000);
                    break;

                case 2:
                    System.out.println("Sensores Ativados");
                    Thread.sleep(3000);
                    break;

                case 3:
                    System.out.println("Modo Autônomo Ligado");
                    Thread.sleep(3000);
                    break;

                case 4:
                    System.out.println("A Melhor Rota Está Sendo Calculada");
                    Thread.sleep(3000);
                    break;

                case 5:
                    System.out.println("Bateria em " + bateria + "%")
                    System.out.println("O Trajeto Será Iniciado");
                    Thread.sleep(3000);
                    break;

                }

            }
            else {
                System.out.println("bateria insuficiente para iniciciar o trajeto");
            
    
            }
        }
    }
}
