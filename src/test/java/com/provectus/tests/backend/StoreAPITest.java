package com.provectus.tests.backend;

import backend.StoreGetAPI;
import backend.enteties.Store;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class StoreAPITest {

    @Test (priority = 10)
    public void PostStoreTest() throws IOException {

        StoreGetAPI newOrder = new StoreGetAPI();

        Store store = new Store();
        store.setId(8);
        store.setPetId(2234);
        store.setQuantity(12);
        store.setStatus("inprogress");
        store.setComplete(true);
        newOrder.serializeStore(store);

        System.out.println("Asserts different field values");
        Assert.assertEquals(store.getId().toString(), "8");
        Assert.assertEquals(store.getPetId().toString(), "2234");
        Assert.assertEquals(store.getQuantity().toString(), "12");

    }


    @Test (priority = 20)
    public void GetOrderTest() throws IOException {


        StoreGetAPI newOrder = new StoreGetAPI();

        newOrder.getOrderById(8);
        //newOrder.returnField("8", "petId");

        System.out.println("Assert if it exist");
        Assert.assertEquals(newOrder.returnField("8", "petId"), "2234");

    }

    @Test (priority = 30)
    public void GetInventoryTest() throws IOException {

        StoreGetAPI inventory = new StoreGetAPI();

        JSONObject responseJson = inventory.getInventory();
        System.out.println(responseJson);

        System.out.println("Assert that not empty");
        Assert.assertNotNull(responseJson.get("available").toString());


    }

    @Test (priority = 40)
    public void DeleteOrderTest() throws IOException {

        StoreGetAPI newOrder = new StoreGetAPI();

        JSONObject responseJson = newOrder.deleteOrder(8);
        System.out.println(responseJson);

        System.out.println("Asserts what?");

       newOrder.getOrderById(8);
       // Assert.assertNotNull(responseJson.get("available").toString());
       // System.out.println(responseJson.get("code"));

    }



}
