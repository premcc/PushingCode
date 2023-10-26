package HTTP_COncepts_In_Rest_Assured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class GET_EXAMPLE_3 {
	
	@Test
	public void ex_3()
	{
		given()
		.when().log().all()
		.get("https://reqres.in/api/users/2")
		.then()
		.body("data.id", equalTo(2));
		
		
		
	}

}
