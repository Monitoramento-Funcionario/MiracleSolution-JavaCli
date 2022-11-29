package model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import netscape.javascript.JSObject;
import org.json.JSONObject;

/**
 *
 * @author thiag
 */
public class Slack {

    private static HttpClient client = HttpClient.newHttpClient();
    private static final String URL
            = "https://hooks.slack.com/services/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";

    public static void sendMessage(JSONObject content) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder(
                URI.create(URL))
                .header("accept", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(content.toString()))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(String.format("Status: %s", response.statusCode()));
        System.out.println(String.format("Response: %s", response.body()));
    }

    public void sendAlerta(String nomeUsuario, String ip) {
        JSONObject json = new JSONObject();

        json.put("text", String.format("\nNome: %s"
                + "\nIP: %s", nomeUsuario, ip));
        try {
            sendMessage(json);
        } catch (IOException ex) {
            Logger.getLogger(Slack.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Slack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}