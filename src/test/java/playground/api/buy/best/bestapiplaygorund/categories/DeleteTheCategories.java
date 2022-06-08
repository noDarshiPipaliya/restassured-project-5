package playground.api.buy.best.bestapiplaygorund.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteTheCategories extends TestBase {
    @Test
    public void deleteTheCategoriesGivenById(){
        Response response = given()
                .pathParam("id","abcat0102003")
                .when()
                .delete("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
