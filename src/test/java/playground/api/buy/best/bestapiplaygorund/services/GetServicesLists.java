package playground.api.buy.best.bestapiplaygorund.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetServicesLists extends TestBase {
    @Test
    public void getAllServicesList(){
        Response response = given()
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
