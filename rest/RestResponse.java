package rest;

import io.restassured.response.Response;

public class RestResponse<T> implements IRestResponse<T>{

public T data;
public Response response;	
	
public RestResponse(Class<T> myClass, Response response) throws InstantiationException, IllegalAccessException {
	
this.response = response;
this.data = myClass.newInstance();

}
	
	
@Override
public T getBody() {

try {
data = (T) response.getBody().as(data.getClass());
}catch (Exception e) {
System.out.println(e);
}
return data;
}


@Override
public int getStatusCode() {

return response.getStatusCode();
}


@Override
public boolean isSuccessful() {

boolean status=false;
int code = response.getStatusCode();
if(code==200||code==201||code==202) {
status=true;
};

return status;
}


@Override
public Response getResponse() {
		
return response;
}

	
	
	

}
