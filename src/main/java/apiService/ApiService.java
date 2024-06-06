package apiService;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;



public class ApiService {

    private final String BASE_URL = "http://localhost:8080/api";
    public String createPasseggero(
            String cf,
            String nome,
            String cognome,
            String email,
            String password,
            int numero,
            String tipo,
            int limite
    ) throws IOException, JSONException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()){
            HttpPost post = new HttpPost(BASE_URL + "/passeggeri/create");

            // Creare un JSON object per i parametri
            JSONObject json = new JSONObject();
            json.put("cf", cf);
            json.put("nome", nome);
            json.put("cognome", cognome);
            json.put("email", email);
            json.put("password", password);
            json.put("numero", numero);
            json.put("tipo", tipo);
            json.put("limite", limite);

            StringEntity entity = new StringEntity(json.toString());
            post.setEntity(entity);
            post.setHeader("Accept", "application/json");
            post.setHeader("Content-type", "application/json");

            try (CloseableHttpResponse response = httpClient.execute(post)) {
                return EntityUtils.toString(response.getEntity());
            }
        }
    }

}
