package playground.api.buy.best.bestapiplaygorund.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.CategoriesPojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class CreateTheCategoriesRecord extends TestBase {

    @Test
    public void createTheCategories(){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("cash");
        categoriesPojo.setId("121");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .post("/categories");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
