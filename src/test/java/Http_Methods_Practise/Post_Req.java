package Http_Methods_Practise;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
public class Post_Req {
	
	@Test
	public void postReq()
	{
		
		JSONObject jso=new JSONObject();
		jso.put("Name", "prem");
		jso.put("age", 25);
		
		given()
		.contentType(ContentType.JSON)
		.body(jso)
		.when().log().all()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
		
	}

}
