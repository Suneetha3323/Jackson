package jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectToJson {
	public static void main(String[]args) {
		try {
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		Employee employee=new Employee();
		employee.setName("Aditya");
		employee.setCity("San Ramon");
		employee.setDepartment("Enterprise Application");
		employee.setDesignation("Project Manager");
		
			
				objectMapper.writeValue(new File("target/emp.json"),employee);
			
			} catch ( IOException e) {
				
				e.printStackTrace();
			}
		
		
	}

}
