package playground.api.buy.best.bestapiplaygorund.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetCategoriesGivenById extends TestBase {
    @Test
    public void getCategoriesById(){
        Response response = given()
                .pathParam("id","abcat0010000")
                .when()
                .get("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
