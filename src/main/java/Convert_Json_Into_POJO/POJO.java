package Convert_Json_Into_POJO;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJO {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		
		ad_Class adress=obj.readValue
		(new File("C:\\Users\\heman\\eclipse\\Rest_Assured_Cocepts\\json\\ad.json"), ad_Class.class);
		
		
		System.out.println(adress.getCity());
		
		

	}

}
