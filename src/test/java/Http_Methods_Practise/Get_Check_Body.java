package Http_Methods_Practise;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.equalTo;
public class Get_Check_Body {
	
	@Test
	public void chekBody()
	{
	  given()
	  .when()
	  .get("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(200)
	  .body("data.email", equalTo("janet.weaver@reqres.in")).log().all()
	  .body("data.first_name", equalTo("Janet"));
		
	}

}
