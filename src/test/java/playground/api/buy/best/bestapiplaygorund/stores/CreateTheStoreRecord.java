package playground.api.buy.best.bestapiplaygorund.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.buy.best.model.ProductPojo;
import playground.api.buy.best.model.StorePojo;
import playground.api.buy.best.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class CreateTheStoreRecord extends TestBase {

    @Test
    public void createTheProduct(){

        StorePojo storePojo = new StorePojo();
        storePojo.setName("vb & sons");
        storePojo.setType("grossery");
        storePojo.setAddress("tooting");
        storePojo.setAddress2("micheam");
        storePojo.setCity("london");
        storePojo.setState("london");
        storePojo.setZip("123456");
        storePojo.setLat(152);
        storePojo.setLng(1542);
        storePojo.setHours("24hours");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(storePojo)
                .when()
                .post("/stores");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
