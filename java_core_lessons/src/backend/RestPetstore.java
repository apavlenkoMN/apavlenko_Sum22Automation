package backend;


import java.io.IOException;

public class RestPetstore {

    public static void main(String[] args) throws IOException {



       //  OkHttpClient client = new OkHttpClient.Builder();


        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);
//        Response response = call.execute();
           Response response = client.newCall(request).execute();

        System.out.println(response);
    }
}
