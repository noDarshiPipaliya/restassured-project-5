package playground.api.buy.best.bestapiplaygorund.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductLists extends TestBase {
    @Test
    public void getAllProductList(){
        Response response = given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
