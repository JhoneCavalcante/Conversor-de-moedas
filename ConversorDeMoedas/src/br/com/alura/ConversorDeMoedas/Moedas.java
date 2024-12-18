package br.com.alura.ConversorDeMoedas;

public record Moedas(String base_code,
                     String target_code,
                     double conversion_rate)
    {
}
