package com.org.RestApi;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

public class samplegetrequest {
  
	//simple get request for getting wheather request by city name
		@Test
		public void Test_01(){	
			get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
			
		}
}
