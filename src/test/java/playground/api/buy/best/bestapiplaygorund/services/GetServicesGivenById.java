package playground.api.buy.best.bestapiplaygorund.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetServicesGivenById extends TestBase {
    @Test
    public void getServicesById(){
        Response response = given()
                .pathParam("id",7)
                .when()
                .get("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
