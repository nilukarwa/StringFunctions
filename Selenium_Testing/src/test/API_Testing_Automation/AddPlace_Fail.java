import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class AddPlace_Fail {
    public static void main(String [] a){
        //Validate if add place API is working as Expected
        //Given - All input details
        //When - Submit the API
        //Then - Validate the Response

        RestAssured.baseURI= "https://rahulshettyacademy.com";
        given().log().all().queryParam("key","qaclick123").
                header("Content-Type","application/json")
                .body("{\n" +
                        "  \"location\": {\n" +
                        "    \"lat\": -38.383494,\n" +
                        "    \"lng\": 33.427362\n" +
                        "  },\n" +
                        "  \"accuracy\": 50,\n" +
                        "  \"name\": \"New Home\",\n" +
                        "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                        "  \"address\": \"29, side layout, cohen 09\",\n" +
                        "  \"types\": [\n" +
                        "    \"shoe park\",\n" +
                        "    \"shop\"\n" +
                        "  ],\n" +
                        "  \"website\": \"http://rahulshettyacademy.com\",\n" +
                        "  \"language\": \"English-IN\"\n" +
                        "}").when().post("/maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(209);
    }
}