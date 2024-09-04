package tests;

import java.util.List;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.restassured.response.Response;
import rest.IRestResponse;
import rest.Post_pojo;
import rest.Rest;
import rest.Token_pojo;


public class TestsClass {
	
	
	


//@Test
public void test00() throws JsonProcessingException, InstantiationException, IllegalAccessException  {

IRestResponse<Token_pojo> token_obj = Rest.get_token();
int code=token_obj.getStatusCode();
boolean succses=token_obj.isSuccessful();
Token_pojo myBody = token_obj.getBody();

System.out.println(code);
System.out.println(succses);
System.out.println(myBody.getAccessToken());


}

@Test
public void test01() throws JsonProcessingException, InstantiationException, IllegalAccessException {
	
IRestResponse<Post_pojo> token_obj = Rest.get_post("4");
int code=token_obj.getStatusCode();
boolean succses=token_obj.isSuccessful();
Post_pojo myBody = token_obj.getBody();

System.out.println(code);
System.out.println(succses);
System.out.println(myBody.getTitle());	

}

	
	
	
	
	
	
	
}
