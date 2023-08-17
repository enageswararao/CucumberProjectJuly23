package pages;


import java.util.List;
import java.util.Map;

public class RegisterForm extends BasePage {

	//properties
     
	
	
	//Methods
    
	public void fillRegisterForm( List<Map<String, String>> jsondataTable) {
		
		System.out.println("Enter Firstname"+ jsondataTable.get(0).get("username"));
		
	}
 
}
