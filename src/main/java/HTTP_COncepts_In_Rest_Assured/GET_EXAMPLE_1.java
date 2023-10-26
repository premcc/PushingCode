package HTTP_COncepts_In_Rest_Assured;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.testng.annotations.Test;

public class GET_EXAMPLE_1 {
	
	
	@Test
	public void VerifyGet()
	{
		given()
		.auth().none()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
	}

}
