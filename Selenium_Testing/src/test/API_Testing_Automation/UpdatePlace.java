import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdatePlace {
    public static void main(String [] a){
        //Validate if add place API is working as Expected
        //Given - All input details
        //When - Submit the API
        //Then - Validate the Response

        //Add Place -> Update Place with New Address -> Get Place to validate if New Address is Present in response

        RestAssured.baseURI= "https://rahulshettyacademy.com";

        //Before showing on Console Response Body
        String res=given().log().all().queryParam("key","qaclick123").
                header("Content-Type","application/json")
                .body(Payload.addPlace()).when().post("/maps/api/place/add/json")
                .then().assertThat().statusCode(200)
                .body("scope",equalTo("APP"))
                .header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();

        //System.out.println("The Response Body: "+res);
        //After removing comment from System.out.println()
        System.out.println("The Response Body: "+res);

        //For Parsing the JSON
        JsonPath path=new JsonPath(res);
        String placeId=path.getString("place_id");
        System.out.println("The Place ID: "+placeId);

        //Update the Place
        given().log().all().queryParam("key","qaclick123")
                .header("Content-Type","application/json").body("{\n" +
                        "\"place_id\":\""+placeId+"\",\n" +
                        "\"address\":\"70 winter walk, USA\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}")
                .when().put("/maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
    }
}