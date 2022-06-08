package playground.api.buy.best.bestapiplaygorund.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteTheProduct extends TestBase {
    @Test
    public void deleteTheProductGivenById(){
        Response response = given()
                .pathParam("id",347146)
                .when()
                .delete("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
