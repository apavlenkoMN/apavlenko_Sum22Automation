package backend;


import backend.enteties.Pet;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class StoreLessonTry {

    //public static void main(String[] args) throws IOException {


    //public JSONObject responseJson; // = new JSONObject();

    public String createPet  (String name) throws IOException{


        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("status", "available");

        JSONArray jsonArray = new JSONArray();
        jsonArray.put("va1");
        jsonArray.put("va2");
        jsonArray.put("va3");


        System.out.println("json to string");
        System.out.println(json.toString());

        RequestBody body = RequestBody.create(json.toString().getBytes());
      //  RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);

        //формирует запрос
        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore.swagger.io/v2/pet")
                .addHeader("Content-Type", "application/json")
                .build();



        OkHttpClient client = new OkHttpClient();
        //отправляет запрос
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        //System.out.println(response.body().string());

        System.out.println("set response body");

        String responseBody = response.body().string();
        //JSONObject responseJson = new JSONObject(responseBody); //передаем строку в объект
        JSONObject responseJson = new JSONObject(responseBody);
        System.out.println("response get id");
        return responseJson.get("id").toString();

    }




    public void getPetById (String id) throws IOException{

        Request request = new Request.Builder()
                .get()
                //.url("https://petstore.swagger.io/v2/pet/findByStatus?status=sold")
               // .url("https://petstore.swagger.io/v2/store/order")
                .url("https://petstore.swagger.io/v2/pet/" + id)
                .build();


        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void serializePet(Pet pet) throws IOException{

        Gson gson = new Gson();
        String json = gson.toJson(pet);

        System.out.println(json);

        RequestBody body = RequestBody.create(json.getBytes());

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore.swagger.io/v2/pet")
                .addHeader("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
//респонсе преобразовать в джсон, и дальше чекать его
        Pet newPet = gson.fromJson(response.body().string(),Pet.class);
        System.out.println(newPet);
    }

    public String returnField (String id, String field) throws IOException{

        Request request = new Request.Builder()
                .get()
                //.url("https://petstore.swagger.io/v2/pet/findByStatus?status=sold")
                // .url("https://petstore.swagger.io/v2/store/order")
                .url("https://petstore.swagger.io/v2/pet/" + id)
                .build();


        OkHttpClient client = new OkHttpClient();
        //отправляет запрос
        Response response = client.newCall(request).execute();

//        System.out.println(response.code());
//        //System.out.println(response.body().string());
//
//        System.out.println("set response body");

        String responseBody = response.body().string();
        //JSONObject responseJson = new JSONObject(responseBody); //передаем строку в объект
        JSONObject responseJson = new JSONObject(responseBody);
        System.out.println("response get field");
        System.out.println(responseJson.get(field));

        return responseJson.get(field).toString();

    }



}
