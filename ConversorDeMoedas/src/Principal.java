import br.com.alura.ConversorDeMoedas.ConsultarMoedas;
import br.com.alura.ConversorDeMoedas.ConverterMoedas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultarMoedas consulta = new ConsultarMoedas();
        
        int opcao = 0;
        while (opcao != 8){
            System.out.println("*****************************************\n" +
                    "Bem vindo ao conversor de moedas\n\n" +
                    "Escolha a conversão que desejas realizar\n\n" +
                    "1. Dollar para Peso Argentino\n" +
                    "2. Peso Argentino para Dollar\n" +
                    "3. Dollar para Real Brasileiro\n" +
                    "4. Real Brasileiro para Dollar\n" +
                    "5. Dollar para Peso Colombiano\n" +
                    "6. Peso Colombiano para Dollar\n" +
                    "7. Converter outra moeda\n" +
                    "8. Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1:
                        ConverterMoedas.converter("USD", "ARS", consulta, leitura);
                        break;
                case 2:
                        ConverterMoedas.converter("ARS", "USD", consulta, leitura);
                        break;
                case 3:
                        ConverterMoedas.converter("USD", "BRL", consulta, leitura);
                        break;
                case 4:
                        ConverterMoedas.converter("BRL", "USD", consulta, leitura);
                        break;
                case 5:
                    ConverterMoedas.converter("USD", "COP", consulta, leitura);
                    break;
                case 6:
                    ConverterMoedas.converter("COP", "USD", consulta, leitura);
                    break;
                case 7:
                    ConverterMoedas.converterOutraMoeda(consulta, leitura);
                        break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}
