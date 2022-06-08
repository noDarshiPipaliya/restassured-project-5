package playground.api.buy.best.bestapiplaygorund.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.ProductPojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UpdateTheProductRecord extends TestBase {
    @Test
    public void updateTheProduct(){
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("iphone");
        productPojo.setType("apple");
        productPojo.setPrice(50000);
        Response response = given()
                .header("Content-Type","application/json")
                .pathParam("id",347137)
                .body(productPojo)
                .when()
                .patch("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
