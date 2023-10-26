package Http_Methods_Practise;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Get_Example {
	
	@Test
	public void getReq()
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("https://reqres.in/api/users/2");
		
		boolean result = res.getBody().asString().contains("email");
		int code = res.statusCode();
		System.out.println("Status code "+code);
		if(result==true)
		{
			System.out.println("The request IS pass");
		}
		
		
	}

}
