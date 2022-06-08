package playground.api.buy.best.bestapiplaygorund.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteTheStore extends TestBase {
    @Test
    public void deleteTheProductGivenById(){
        Response response = given()
                .pathParam("id",8)
                .when()
                .delete("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
