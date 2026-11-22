
package br.com.deveduardo.buscalivros.principal;

import br.com.deveduardo.buscalivros.modelos.Capa;
import br.com.deveduardo.buscalivros.modelos.RespostaAPI;
import br.com.deveduardo.buscalivros.modelos.ItemAPI;
import br.com.deveduardo.buscalivros.modelos.VolumeInfo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaLivros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do livro que deseja buscar: ");
        String busca = sc.nextLine();

        String url = "https://www.googleapis.com/books/v1/volumes?q=" +
                busca.trim().replace(" ","+")
                +"&key=SUA_CHAVE_API_AQUI";


        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() != 200) {
                System.out.println("Erro na requisição: " + response.statusCode());
                return;
            }

            String json = response.body();

            Gson gson = new Gson();

            RespostaAPI resposta = gson.fromJson(json, RespostaAPI.class);

            if (resposta.items() == null || resposta.items().isEmpty()) {
                System.out.println("Nenhum livro encontrado.");
                return;
            }

            for (ItemAPI item : resposta.items()) {

                if (item.volumeInfo() == null) {
                    continue;
                }

                VolumeInfo volumeInfo = item.volumeInfo();

                Capa capa = new Capa(volumeInfo);

                System.out.println(capa);
            }

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
