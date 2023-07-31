package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class TaskListPage extends BaseClass {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomer;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement verifyCustomer;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn(){
        return addNewBtn;
		
	}
public WebElement getNewCustomer() {
		return newCustomer;
	}
public WebElement getCustomerDescription()     {
	return customerDescription;
}
public WebElement getSelectCustomer(){
	return selectCustomer;
}
public WebElement getBigBangCompany() {
	return bigBangCompany;
	
}
public WebElement getCreateCustomer() {
	return createCustomer;
}	

public WebElement getCustomerName() {
	return customerName;
	
}
public WebElement getVerifyCustomer()   {
	return verifyCustomer;
	
}

}
