package com.orange;

import actions.Action;
import base.BaseClass;
import org.openqa.selenium.By;

public class PimPage extends BaseClass {
    Action action = new Action();
    By employeeNameTxtBox =
            By.xpath("//label[normalize-space()='Employee Name']//ancestor::div[2]//input");
    By searchBtn= By.xpath("//button[normalize-space()='Search']");
    By editIcon= By.xpath("(//div[@class='oxd-table-card'])//button[2]");
    By contactDetailsBtn= By.xpath("//a[normalize-space()='Contact Details']");

    public void searchByEmployeeName(String name){
        action.type(employeeNameTxtBox,name);
        action.click(searchBtn);
    }
    public void clickOnEditIcon(){
        waitUntilElementIsVisible(editIcon);
        action.click(editIcon);
    }
    public void clickOnContactDetails(){
        waitUntilElementIsVisible(contactDetailsBtn);
        action.click(contactDetailsBtn);
    }
}
