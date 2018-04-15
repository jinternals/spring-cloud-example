package com.jinternals.spring.cloud.example.zuul;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeOutTest {


    int ConnectTimeout = 30000;
    int ReadTimeout = 3000;
    int MaxAutoRetries = 1;
    int MaxAutoRetriesNextServer = 1;

    @Test
    public void calculateHystrixTimeOut() {


        int hystrixTimeOut = ((ConnectTimeout + ReadTimeout) * (MaxAutoRetries + 1) * (MaxAutoRetriesNextServer + 1));

        assertEquals(132000,hystrixTimeOut);


    }
}
