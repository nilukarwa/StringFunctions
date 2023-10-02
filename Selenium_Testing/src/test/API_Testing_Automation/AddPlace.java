import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AddPlace {
    public static void main(String[] a) {
        //Validate if add place API is working as Expected
        //Given - All input details
        //When - Submit the API
        //Then - Validate the Response

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().
                queryParam("key", "qaclick123").
                header("Content-Type", "application/json").
                body(Payload.addPlace()).
                when().
                post("/maps/api/place/add/json").
                then().log().all().assertThat().statusCode(200).
                body("scope", equalTo("APP")).
                header("server", "Apache/2.4.52 (Ubuntu)");
        //Add Place -> Update Place with New Address ->
        // Get Place to validate if New Address is Present in response
    }
}