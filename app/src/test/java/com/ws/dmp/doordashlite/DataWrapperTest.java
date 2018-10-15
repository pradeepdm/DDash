package com.ws.dmp.doordashlite;

import com.ws.dmp.doordashlite.model.Restaurant;
import com.ws.dmp.doordashlite.utils.DataWrapper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prade on 10/14/2018.
 */
public class DataWrapperTest {

    private DataWrapper<Restaurant> dataWrapper;

    @Before
    public void setup() {
        dataWrapper = new DataWrapper<>();
    }

    @Test
    public void setData_Test() {
        Restaurant expectedData = new Restaurant();
        expectedData.setAverageRating(4.0);
        expectedData.setDeliveryFee(200);
        expectedData.setName("McDonalds!");
        dataWrapper.setData(expectedData);

        Restaurant actualData = dataWrapper.getData();
        Assert.assertEquals(expectedData.getAverageRating(), actualData.getAverageRating());
        Assert.assertEquals(expectedData.getDeliveryFee(), actualData.getDeliveryFee());
        Assert.assertEquals(expectedData.getName(), actualData.getName());
    }
}
