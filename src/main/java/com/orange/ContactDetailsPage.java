package com.orange;

import actions.Action;
import base.BaseClass;
import org.openqa.selenium.By;

public class ContactDetailsPage extends BaseClass {
    Action action = new Action();

    By citytextbox = By.xpath("//label[normalize-space()='City']//ancestor::div[2]//input");

    By statetextbox = By.xpath("//label[normalize-space()='State/Province']//ancestor::div[2]//input");

    By zipcodetextbox = By.xpath("//label[normalize-space()='Zip/Postal Code']//ancestor::div[2]//input");


    public void FillContactdetails (String city, String state , String zipcode ) {
        action.type(citytextbox, city);
        action.type(statetextbox,state);
        action.type(zipcodetextbox,zipcode);


    }
}
