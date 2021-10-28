package jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] args) {
		try {
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			
			String employeeJson="{\"name\":\"Aditya\",\"city\":\"San Ramon\",\"department\":\"Enterprise Application\",\"designation\":\"Project Manager\"}";
				
					Employee emp = objectMapper.readValue(employeeJson,Employee.class);
					System.out.println(emp.toString());
					System.out.println(emp.getCity());
				
				} catch (IOException e) {
					
					e.printStackTrace();
				}

	}

}
