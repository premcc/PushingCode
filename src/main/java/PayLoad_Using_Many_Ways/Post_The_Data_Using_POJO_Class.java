package PayLoad_Using_Many_Ways;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Post_The_Data_Using_POJO_Class {
	
	public static void main(String[] args) throws Throwable {

		IssueType it=new IssueType("critical");
		
		Projects pt=new Projects("RESt");
		
		Payload_Final pa=new Payload_Final("practisePOJO", "my", it, pt);
		Fields f=new Fields(pa);
		
		ObjectMapper obj=new ObjectMapper();
		obj.writerWithDefaultPrettyPrinter().writeValueAsString(f);
	}
	
	
	 

}
