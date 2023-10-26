package Http_Methods_Practise;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;

public class Two_Objects_In_Json_Post {
	
	@Test
	public void p1()
	{
		JSONObject jso=new JSONObject();
		JSONObject jso1=new JSONObject();
		
		jso.put("ID", 123);
		jso.put("Name", "Prem");
		jso.put("Age", 25);
		jso.put("Hobbies", jso1);
		
		jso1.put("H1", "cricket");
		jso1.put("H2", "vollyboll");
		
		
		
		given()
		.contentType(ContentType.JSON)
		.body(jso)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.log().body()
		.statusCode(201);
		
	}

}
