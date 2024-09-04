package rest;

import io.restassured.response.Response;

public interface IRestResponse<T> {
	
public T getBody();
		
public int getStatusCode();
	
public boolean isSuccessful();
		
public Response getResponse();
	


}
