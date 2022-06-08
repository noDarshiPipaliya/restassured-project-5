package playground.api.buy.best.bestapiplaygorund.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductGivenById extends TestBase {
    @Test
    public void getProductById(){
        Response response = given()
                .pathParam("id",346646)
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
