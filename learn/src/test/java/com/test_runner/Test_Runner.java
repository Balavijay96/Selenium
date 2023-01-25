package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.Maven_Practice.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Bala\\study\\eclipse-workspace\\learn\\src\\test\\java\\com\\learn\\Adactin.feature",
glue="com\\step_definition",
monochrome=true,
		dryRun=false,
		plugin= {"usage","junit:target/cucumber-reports/report.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Test_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
		//Baseclass.launch();
		driver=Baseclass.launch();
	
	}



}
