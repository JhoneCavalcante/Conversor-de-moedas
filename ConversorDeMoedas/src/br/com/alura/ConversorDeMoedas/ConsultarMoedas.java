package br.com.alura.ConversorDeMoedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoedas {

    public Moedas buscarMoedas(String moedaBase, String moedaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/950377a6ccf365e785d75c87/latest/USD" + moedaBase + "/" + moedaTarget);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moedas.class);
        } catch (Exception e) {
            throw new RuntimeException("Moeda não encontrada");
        }

    }
}
