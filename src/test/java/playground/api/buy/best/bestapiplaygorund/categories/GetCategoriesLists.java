package playground.api.buy.best.bestapiplaygorund.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetCategoriesLists extends TestBase {
    @Test
    public void getAllCategoriesList(){
        Response response = given()
                .when()
                .get("/categories");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
