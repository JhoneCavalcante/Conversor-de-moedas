package br.com.alura.ConversorDeMoedas;

import java.util.Scanner;

public class ConverterMoedas {
    public static void converter(String moedaBase, String moedaTarget, ConsultarMoedas consulta, Scanner leitura){
        double quantidade;
        double quantidadeConvertida;

        Moedas moedas = consulta.buscarMoedas(moedaBase, moedaTarget);
        System.out.println("Taxa de conversão para hoje\n1 "+moedaBase+ " = "+moedas.conversion_rate()+" "+moedaTarget);
        System.out.println("Coloque a quantidade de " + moedaBase);
        quantidade = Double.parseDouble(leitura.nextLine());
        quantidadeConvertida = quantidade * moedas.conversion_rate();
        System.out.println(quantidade+" "+moedaBase +" = " +quantidadeConvertida + " " + moedas.target_code());
    }

        public static void converterOutraMoeda(ConsultarMoedas consulta, Scanner leitura){
            System.out.println("Coloque o código da moeda base:");
            String moedaBase = leitura.nextLine().toUpperCase();
            System.out.println("Coloque a moeda");
            String moedaObjetivo = leitura.nextLine().toUpperCase();
            converter(moedaBase, moedaObjetivo, consulta, leitura);

        }
}
