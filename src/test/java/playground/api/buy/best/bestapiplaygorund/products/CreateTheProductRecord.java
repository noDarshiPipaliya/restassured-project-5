package playground.api.buy.best.bestapiplaygorund.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.ProductPojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class CreateTheProductRecord extends TestBase {

    @Test
    public void createTheProduct(){
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("dell");
        productPojo.setType("laptop");
        productPojo.setPrice(80000);
        productPojo.setShipping(5);
        productPojo.setUpc("laptop");
        productPojo.setDescription("dell core 7");
        productPojo.setManufacturer("2022");
        productPojo.setModel("526410");
        productPojo.setUrl("http://xyz.com");
        productPojo.setImage("lap.jpg");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productPojo)
                .when()
                .post("/products");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
