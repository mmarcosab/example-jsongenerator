package com.example.api.resource;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class HomeResourceTest {

    private HomeResource homeResource;

    @Before
    public void init(){
        homeResource = new HomeResource();
    }

    @Test
    public void testHome(){
        String x = homeResource.getHome();
        System.out.println(x);
    }

}
