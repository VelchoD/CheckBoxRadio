package PageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.base;
import testData.testdata;

public class CheckRadioPageObjects extends base {
	
	 testdata td=new testdata ();
	 
	//Web element checkbox1
	@FindBy(xpath ="//input[@id='my-check-1']")
	WebElement checkbox1;

	//Web element checkbox2
	@FindBy(xpath ="//input[@id='my-check-2']")
	WebElement checkbox2;
	
	//Web element radiobutton1
	@FindBy(xpath = "//input[@id='my-radio-1']")
	WebElement radiobutton1;
	
	//Web element radiobutton2
	@FindBy(xpath = "//input[@id='my-radio-1']")
	WebElement radiobutton2;
	
	//Web element dropdown1
	@FindBy(xpath = "//select[@name='my-select']")
	WebElement dropdown1;
	
	//Web element dropdown2
	@FindBy(xpath = "//input[@name='my-datalist']")
	WebElement dropdown2;
		
	//Web element elementover
	@FindBy(xpath = "//input[@name='my-date']")
	WebElement elementover;
		
	//Init Elements
	public CheckRadioPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Checkbox() {
		  checkbox1.click();
		  System.out.println("is checkbox1 displayed " +checkbox1.isDisplayed());
		  System.out.println("is checkbox1 enabled " +checkbox1.isEnabled());
		  System.out.println("is checkbox1 selected " +checkbox1.isSelected());
		  checkbox1.click();
		  System.out.println("is checkbox1 selected after click " +checkbox1.isSelected());

		  System.out.println("is checkbox2 displayed " +checkbox2.isDisplayed());
		  System.out.println("is checkbox2 enabled " +checkbox2.isEnabled());
		  System.out.println("is checkbox2 selected " +checkbox2.isSelected());
	      checkbox2.click();  
		  System.out.println("is checkbox2 selected after click " +checkbox2.isSelected());
	}
	
	public void RadioButton() {
	    System.out.println("is RadioButton1 displayed " +radiobutton1.isDisplayed());
	    System.out.println("is  RadioButton1 enabled " +radiobutton1.isEnabled());
	    System.out.println("is RadioButton1 selected " +radiobutton1.isSelected());
    	radiobutton1.click();
	    System.out.println("is RadiobButton1 selected after click " +radiobutton1.isSelected());
	    System.out.println("is RadioButton2 displayed " +radiobutton2.isDisplayed());
	    System.out.println("is  RadioButton2 enabled " +radiobutton2.isEnabled());
	    System.out.println("is RadioButton2 selected " +radiobutton2.isSelected());
	    radiobutton2.click();
	    System.out.println("is RadiobButton2 selected after click " +radiobutton2.isSelected());
	}

	public void DropDown() {
		Select selectelement1=new Select(dropdown1);
		selectelement1.selectByValue("2");
		dropdown2.click();
		dropdown2.sendKeys("New York");
	  
	}
	public void MouseOver() {
		 Actions action = new Actions(driver);
		 action.moveToElement(elementover).click().perform();
	}
	
	public void assertTrue(boolean selected) {
		  assertTrue(checkbox1.isSelected());
		  assertTrue(checkbox2.isSelected());
	   	assertTrue(radiobutton1.isSelected());
		assertTrue(radiobutton1.isSelected());
		 assertTrue(dropdown1.isSelected());
		 assertTrue(dropdown2.isSelected());
		  assertTrue(elementover.isDisplayed());	

}

}











