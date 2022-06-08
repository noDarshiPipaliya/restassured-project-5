package playground.api.buy.best.bestapiplaygorund.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetStoreLists extends TestBase {
    @Test
    public void getAllStoreList(){
        Response response = given()
                .when()
                .get("/stores");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
