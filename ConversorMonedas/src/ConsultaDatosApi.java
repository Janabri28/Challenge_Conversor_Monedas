import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


public class ConsultaDatosApi {


    private String monedaB;


    public ConsultaDatosApi(String monedaB) {

        this.monedaB = monedaB;
    }


      public DatosApi buscaDatos(String codigoConv) throws IOException, InterruptedException {

        String direccion="https://v6.exchangerate-api.com/v6/4a29e82d01d699caaa1e9fea/latest/"+monedaB;

                HttpClient client = HttpClient.newHttpClient();
        HttpRequest request=HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();



        try {
            HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),DatosApi.class);
        } catch (Exception e ) {
            throw new RuntimeException("No encontré esa opción");
        }


    }

    public double encuentra(DatosApi datos,String codigoConv){
        //Accediendo un valor usando el codigoDeMoneda
        Map<String, Double> tasasConversion = datos.conversion_rates();
        double valor= tasasConversion.get(codigoConv);
         return valor;
    }


}
