package playground.api.buy.best.bestapiplaygorund.utilities;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetVersion extends TestBase {
    @Test
    public void getAllStoreList(){
        Response response = given()
                .when()
                .get("/version");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
