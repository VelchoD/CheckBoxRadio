package CheckBoxTestCases;

import org.testng.annotations.Test;

import PageObjects.CheckRadioPageObjects;
import base.base;
import testData.testdata;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class CheckRadioTestCases extends base {
	
	
	CheckRadioPageObjects crpo;
	testdata td ;

 
  @BeforeMethod
  public void beforeMethod()  {
	  
		openApplication();
		crpo = new CheckRadioPageObjects ();
		td = new testdata();
	}
  
  @Test
  public void Checkbox() {
	  crpo.Checkbox();
	   	  
  }

  @Test
  public void RadioButton() {
	  crpo.RadioButton();
	 	  
  }

  @Test
  public void DropDown() {
	  crpo.DropDown();
	 	  
  }
  @Test
  public void MouseOver() {
	  crpo.MouseOver();
	 	  
  } 
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
  }  
}





