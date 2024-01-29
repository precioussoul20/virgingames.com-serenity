package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class PotSteps {

    static ValidatableResponse response;

    @Step("Getting all pots information")
    public ValidatableResponse getAllPotsInfo() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_POTS)
                .then().log().all()
                .statusCode(200);

    }
    @Step("Getting all pots information where currency is GBP")
    public ValidatableResponse getAllPotGBP(){
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("currency", "GBP")
                .when()
                .get(EndPoints.GET_ALL_POTS)
                .then().log().all()
                .statusCode(200);


    }
    @Step("Getting all pots information where currency is EUR")
    public ValidatableResponse getAllPotEUR(){
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("currency", "EUR")
                .when()
                .get(EndPoints.GET_ALL_POTS)
                .then().log().all()
                .statusCode(200);

    }
    @Step("Getting all pots information where currency is SEK")
    public ValidatableResponse getAllPotSEK(){
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("currency", "SEK")
                .when()
                .get(EndPoints.GET_ALL_POTS)
                .then().log().all()
                .statusCode(200);

    }
}
