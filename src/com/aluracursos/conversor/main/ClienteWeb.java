package com.aluracursos.conversor.main;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteWeb {

    private final String API_KEY = "5502bbf5a42dfa479d65681e";
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private final HttpClient client;
    private final Gson gson;

    public ClienteWeb(){
        this.client = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public ExchangeRateAPIDto convertirMoneda(String convertirDe, String convertirA, double cantidad){
        try{
            String url = BASE_URL + API_KEY + "/pair/" + convertirDe + "/" + convertirA + "/" + cantidad;
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), ExchangeRateAPIDto.class);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API de conversión de moneda: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


}
