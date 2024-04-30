package com.conversordemonedas.modelos;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Convertor {
    public DatosConvertor conversorDeMonedas(String moneda1, String moneda2, int valor){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a016d9fec4bbd67ea4b53af3/pair/"+moneda1 + "/" + moneda2+ "/"+valor);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DatosConvertor.class);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
