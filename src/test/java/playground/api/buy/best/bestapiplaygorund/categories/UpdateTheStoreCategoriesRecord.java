package playground.api.buy.best.bestapiplaygorund.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.CategoriesPojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UpdateTheStoreCategoriesRecord extends TestBase {
    @Test
    public void updateTheCategories(){

        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("cash");
        Response response = given()
                .header("Content-Type","application/json")
                .pathParam("id","abcat0020002")
                .body(categoriesPojo)
                .when()
                .patch("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
