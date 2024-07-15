import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.swing.*;

public class BuscaMoeda {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/d6dbcd903fa17ac35dbe759a/latest/BRL"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("Conversão");

            double usdRate = rates.get("USD").getAsDouble();
            JOptionPane.showMessageDialog(null,"Taxa de câmbio para USD: " + usdRate);
        } else {
            System.out.println("Erro ao obter dados da API.");
        }
    }
}
