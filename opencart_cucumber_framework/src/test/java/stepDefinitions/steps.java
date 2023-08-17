package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.RegisterForm;
import testutilties.TestDataProvider;

public class steps {

	@Given("User Launch browser")
	public void user_launch_browser() {

		System.out.println("User Launch browser");
	}

	/*
	 * // with key value pair
	 * 
	 * @When("Enter user name and passwrod") public void
	 * enter_user_name_and_passwrod(io.cucumber.datatable.DataTable dataTable) {
	 * Map<String, String> userinfo = dataTable.asMap();
	 * 
	 * System.out.println(userinfo.get("username"));
	 * System.out.println(userinfo.get("password")); }
	 */
	// with key value pair
	@When("Enter user name and passwrod")
	public void enter_user_name_and_passwrod(io.cucumber.datatable.DataTable dataTable) {
		      
		List<Map<String,String>> mapList = dataTable.asMaps();
		
		System.out.println(mapList.get(0).get("username"));
		System.out.println(mapList.get(0).get("password"));
	}
	


	@When("Enter user name {string}")
	public void enter_user_name(String string) {
		System.out.println("Example  User Name testdata ::"+string);
	}

	@When("Enter password {string}")
	public void enter_password(String string) {
	
		System.out.println("Example Password  testdata ::"+string);
	}
	     

	@Given("The excel file name and location is given as")
	public void the_excel_file_name_and_location_is_given_as(DataTable dataTable) {
		List<Map<String, String>> lists =dataTable.asMaps();
		List<Map<String, String>>jsondataTable = TestDataProvider.getTestData( lists.get(0).get("Location"), lists.get(0).get("Keyword"));
		//System.out.println("jsondataTable::"+jsondataTable);
	}




	@Given("The excel file2 name and location is given as")
	public void the_excel_file2_name_and_location_is_given_as(DataTable dataTable) {
 
		List<Map<String, String>> lists =dataTable.asMaps();
		List<Map<String, String>>jsondataTable = TestDataProvider.getTestData(lists.get(0).get("Location"), lists.get(0).get("Keyword"));
		System.out.println("jsondataTable::"+jsondataTable);
	}

 
 
  

	@Given("The excel file3 name and location is given as {string} and {string}")
	public void the_excel_file3_name_and_location_is_given_as_and(String string, String string2) {
		List<Map<String, String>>jsondataTable = TestDataProvider.getTestData(string,string2);
		RegisterForm registerForm = new RegisterForm();
		registerForm.fillRegisterForm(jsondataTable);
	 
		System.out.println("jsondataTable::"+jsondataTable);
	}













	
}
