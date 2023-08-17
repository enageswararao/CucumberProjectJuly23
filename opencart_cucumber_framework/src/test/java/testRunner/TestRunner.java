package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                 features= {".//Features/Login2.feature"},
                
                glue="stepDefinitions",
		/*
		 * plugin= {"pretty", "html:reports/myreport.html",
		 * "json:reports/myreport.json", "rerun:target/rerun.txt", },
		 */
                 monochrome=true,
                 tags = "@sanity"	//Scenarios tagged with @sanity,
               
        )

public class TestRunner {

}

