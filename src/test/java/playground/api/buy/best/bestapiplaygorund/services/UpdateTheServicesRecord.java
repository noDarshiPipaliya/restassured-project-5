package playground.api.buy.best.bestapiplaygorund.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.ServicesPojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UpdateTheServicesRecord extends TestBase {
    @Test
    public void updateTheServices(){
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("smitt");
        Response response = given()
                .header("Content-Type","application/json")
                .pathParam("id",9)
                .body(servicesPojo)
                .when()
                .patch("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
