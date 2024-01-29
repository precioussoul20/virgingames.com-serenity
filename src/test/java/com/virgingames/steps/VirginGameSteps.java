package com.virgingames.steps;

import com.virgingames.testbase.TestBase;
import com.virgingames.virgingamesinfo.PotSteps;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class VirginGameSteps extends TestBase {
   static ValidatableResponse response;


    @Steps
    PotSteps steps;

    @Title("This will get all games data")
    @Test
    public void test001(){
         response = steps.getAllPotsInfo().statusCode(200);
    }

    @Title("This will get all games where currency is GBP ")
    @Test
    public void test002(){
        response = steps.getAllPotGBP().statusCode(200);

    }
    @Title("This will get all games where currency is EUR ")
    @Test
    public void test003(){
        response = steps.getAllPotEUR().statusCode(200);

    }
    @Title("This will get all games where currency is SEK ")
    @Test
    public void test004(){
        response = steps.getAllPotSEK().statusCode(200);

    }
}
