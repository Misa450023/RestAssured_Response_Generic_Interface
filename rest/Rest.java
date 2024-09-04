package rest;

import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest {
	
	
public static String giveBody() throws JsonProcessingException {
	
Random r = new Random();
String s=String.valueOf(r.nextInt(5000));
Payload myBody=new Payload();
myBody.setClientName("merdzan");
myBody.setClientEmail("zabit"+s+"@gmail.com");
ObjectMapper mapper=new ObjectMapper();
String body = mapper.writeValueAsString(myBody);

return body;
}
	
	
	
	
	
	
public static IRestResponse<Post_pojo> get_post(String id) throws InstantiationException, IllegalAccessException {
	
RequestSpecification rs= RestAssured.given();
rs.baseUri("https://jsonplaceholder.typicode.com");
rs.pathParam("id", id);
Response res=rs.get("/posts/{id}");

return new RestResponse(Post_pojo.class, res);
}


public static IRestResponse<Token_pojo> get_token() throws JsonProcessingException, InstantiationException, IllegalAccessException {
	
RequestSpecification rs= RestAssured.given();
rs.baseUri("https://simple-books-api.glitch.me");
System.out.println(giveBody());
rs.body(giveBody());
rs.header("content-type","application/json");
Response res=rs.post("/api-clients/");
 
return new RestResponse(Token_pojo.class, res);
}









}










