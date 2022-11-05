package model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
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
    
    
}
