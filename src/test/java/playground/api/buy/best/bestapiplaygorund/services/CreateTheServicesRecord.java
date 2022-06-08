package playground.api.buy.best.bestapiplaygorund.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.ServicesPojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class CreateTheServicesRecord extends TestBase {

    @Test
    public void createTheServices(){
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("dell");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
