package SeleniumJava;

import org.testng.annotations.DataProvider;

public class DataProviderSet {
	
    @DataProvider(name ="create")
    
    public Object[][] dataSet1(){
    	return new Object[][]{
    		{"username", "password"},
    		{"student", "Password123"},
    		{"stu", "pass12"}
    	};
    }

}
