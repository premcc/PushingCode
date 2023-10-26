package HTTP_COncepts_In_Rest_Assured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class GET_EXAMPLE_2 {
	
	@Test
	public void ex2()
	{
		Response res=
		given()
		.contentType("application/json; charset=utf-8")
		.when().log().all()
		.get("https://reqres.in/api/unknown/2");
		
		
		Assert.assertEquals(res.statusCode(), 200);
		
		
		
	
		
	}

}
