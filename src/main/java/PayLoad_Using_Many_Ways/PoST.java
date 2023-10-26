package PayLoad_Using_Many_Ways;

import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;

public class PoST {

	public static void main(String[] args) throws Throwable {
		IssueType it = new IssueType("critical");

		Projects pt = new Projects("RESt");

		Payload_Final pa = new Payload_Final("practisePOJO", "my", it, pt);
		Fields f = new Fields(pa);

		ObjectMapper obj = new ObjectMapper();
		obj.writerWithDefaultPrettyPrinter().writeValueAsString(f);

		baseURI = "https://reqres.in/api";
		given().contentType(ContentType.JSON).body(obj)
		.when()
		   .post("/users")
		.then().log().all()
		   .statusCode(201);

	}

}
