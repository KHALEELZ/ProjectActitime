package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.ActiTIME_Enter_Time_Track;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass{
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException
{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Reporter.log("CreateCustomer", true);
ActiTIME_Enter_Time_Track a=new ActiTIME_Enter_Time_Track (driver);
a.setTasks();
TaskListPage at=new TaskListPage(driver);
at.getAddNewBtn().click(); at.getNewCustomer().click();
FileLib l=new FileLib();
String customerName = l.getExcelData("CreateCustomer", 1, 2);
at.getCustomerName().sendKeys(customerName); 
String custDescription= l.getExcelData("CreateCustomer", 1, 3);
at.getCustomerDescription().sendKeys(custDescription);
at.getSelectCustomer().click();
Thread.sleep(2000);
at.getBigBangCompany().click();
at.getCreateCustomer().click();
Thread.sleep(4000); String expectedResult=customerName;
String actualResult=at.getVerifyCustomer().getText();
s.assertEquals(actualResult, expectedResult); 
System.out.println("Expected result: "+expectedResult);
System.out.println("After creating customer: "+actualResult);
s.assertAll();

}
}
