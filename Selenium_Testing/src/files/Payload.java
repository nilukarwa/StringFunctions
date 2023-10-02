public class Payload {
    public static String addPlace(){
        return "{\n" +
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
                "}";
    }
    public static String coursePrice(){
        return"{\n" +
                "\t\"dashboard\": {\n" +
                "\t\t\"purchaseAmount\": 910,\n" +
                "\t\t\"website\": \"rahulshettyacademy.com\"\n" +
                "},\n" +
                "\t\"courses\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"title\": \"Selenium Python\",\n" +
                "\t\t\t\"price\": 50,\n" +
                "\t\t\t\"copies\": 6\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"title\": \"Cypress\",\n" +
                "\t\t\t\"price\": 40,\n" +
                "\t\t\t\"copies\": 4\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"title\": \"RPA\",\n" +
                "\t\t\t\"price\": 45,\n" +
                "\t\t\t\"copies\": 10\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
    }
    public static String addBook(String aisle, String isbn){
        String inputPayload = "{\n" +
                "\"name\": \"Learn Appium Automation with Java\",\n" +
                "\"isbn\": \""+isbn+"\",\n" +
                "\"aisle\": \""+aisle+"\",\n" +
                "\"author\": \"John Foe\"\n" +
                "}\n";
        //System.out.println(inputPayload);
        return inputPayload;
    }
    public static String addBook(){
        String inputPayload = "{\n" +
                "\"name\": \"Learn Appium Automation with Java\",\n" +
                "\"isbn\": \"lmn\",\n" +
                "\"aisle\": \"001\",\n" +
                "\"author\": \"John Foe\"\n" +
                "}\n";
        return inputPayload;
    }
}