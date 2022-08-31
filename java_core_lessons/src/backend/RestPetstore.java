package backend;


import okhttp3.*;

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

        System.out.println("resp1");
        System.out.println(response);

        request = new Request.Builder().url("https://petstore.swagger.io/v2/pet/1").build();
        //Call call = client.newCall(request);
//        Response response = call.execute();
        response = client.newCall(request).execute();

        System.out.println("resp2");
        System.out.println(response);


        request = new Request.Builder().url("https://petstore.swagger.io/v2/store/inventory").build();
        //Call call = client.newCall(request);
//        Response response = call.execute();
        response = client.newCall(request).execute();

        System.out.println("resp3");
        System.out.println(response);


        System.out.println("post update");
        RequestBody formBody = new FormBody.Builder()
                .add("id", "1")
                .add("petId", "1")
                .add("quantity", "2")
                .add("shipDate", "2022-08-24T12:29:36.909+0000")
                .add("status", "placed")
                .add("complete", " true")
                .build();

        Request requestPost = new Request.Builder()
                .url("https://petstore.swagger.io/v2/store/order")
                .post(formBody)
                .build();

        Call call2 = client.newCall(requestPost);
        Response responsePost = call2.execute();

        System.out.println(responsePost);
       // assertThat(responsePost.code(), equalTo(200));


    }
}
