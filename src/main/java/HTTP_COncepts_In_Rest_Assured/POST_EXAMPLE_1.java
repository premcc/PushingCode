package HTTP_COncepts_In_Rest_Assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import java.util.*;
import java.util.LinkedHashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class POST_EXAMPLE_1 {
	
	@Test
	public void postEX()
	{
		baseURI="https://reqres.in/api";
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("id", "23");
		map.put("Name", "Prem");
		
		JSONObject request=new JSONObject(map);
		System.out.println("Converting map data into json "+request.toJSONString());
		given()
		.header("Content-Type", "application/json; charset=utf-8")
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString())

		.when().log().all()
		
		
		.post("/users");
	}

}
