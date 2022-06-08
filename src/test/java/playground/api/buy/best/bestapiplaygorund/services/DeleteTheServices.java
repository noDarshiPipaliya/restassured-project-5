package playground.api.buy.best.bestapiplaygorund.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteTheServices extends TestBase {
    @Test
    public void deleteTheServicesGivenById(){
        Response response = given()
                .pathParam("id",8)
                .when()
                .delete("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
