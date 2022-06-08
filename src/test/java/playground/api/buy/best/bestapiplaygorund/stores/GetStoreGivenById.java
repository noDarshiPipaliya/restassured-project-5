package playground.api.buy.best.bestapiplaygorund.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetStoreGivenById extends TestBase {
    @Test
    public void getStoreById(){
        Response response = given()
                .pathParam("id",11)
                .when()
                .get("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
