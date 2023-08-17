package testutilties;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class TestDataProvider {

	
	public static List<Map<String,String>> getTestData(String filelocation,String jsonkey){
		String str = System.getProperty("user.dir");
		String jsonpath  =System.getProperty("user.dir")+filelocation;
		JsonPath path = JsonPath.from(new File(jsonpath));
		List<Map<String,String>> testmaps = path.getList(jsonkey);
		
		return testmaps;
		
		
	}
	
	public static void main(String[] args) {
 
	}

}
