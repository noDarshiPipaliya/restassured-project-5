package playground.api.buy.best.bestapiplaygorund.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.ProductPojo;
import playground.api.buy.best.model.StorePojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UpdateTheStoreRecord extends TestBase {
    @Test
    public void updateTheProduct(){

        StorePojo storePojo = new StorePojo();
        storePojo.setName("vb & sons");
        storePojo.setType("cash & carry");
        storePojo.setAddress("harrow");
        Response response = given()
                .header("Content-Type","application/json")
                .pathParam("id",12)
                .body(storePojo)
                .when()
                .patch("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
