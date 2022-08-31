package backend;


import backend.enteties.Store;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class StoreGetAPI {

    public void getOrderById (Integer id) throws IOException{



        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/order/" + id)
                .build();


        OkHttpClient client = new OkHttpClient();
        //отправляет запрос
        Response response = client.newCall(request).execute();

        String responseBody = response.body().string();
        JSONObject responseJson = new JSONObject(responseBody);

    }

    public void serializeStore(Store store) throws IOException{

        Gson gson = new Gson();
        String json = gson.toJson(store);

        System.out.println(json);

        RequestBody body = RequestBody.create(json.getBytes());

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore.swagger.io/v2/store/order")
                .addHeader("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
//респонсе преобразовать в джсон, и дальше чекать его
        Store newOrder = gson.fromJson(response.body().string(),Store.class);
        System.out.println(newOrder);
    }

    public String returnField (String id, String field) throws IOException{

        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/order/" + id)
                .build();


        OkHttpClient client = new OkHttpClient();
        //отправляет запрос
        Response response = client.newCall(request).execute();

        String responseBody = response.body().string();
//передаем строку в объект
        JSONObject responseJson = new JSONObject(responseBody);
        System.out.println("response get field");
        System.out.println(responseJson.get(field));

        return responseJson.get(field).toString();

    }

    public JSONObject getInventory () throws IOException{

        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/inventory")
                .build();


        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        String responseBody = response.body().string();
        JSONObject responseJson = new JSONObject(responseBody);

        return responseJson;

    }


    public JSONObject deleteOrder(Integer id) throws IOException{

        Request request = new Request.Builder()
                .delete()
                .url("https://petstore.swagger.io/v2/store/order/" + id)
                .build();


        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        String responseBody = response.body().string();
        JSONObject responseJson = new JSONObject(responseBody);

        //System.out.println(responseJson);
        return responseJson;

    }



}

