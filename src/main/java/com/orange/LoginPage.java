package com.orange;

import actions.Action;
import base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
    Action action = new Action();

    By userNameTxtBox = By.name("username");
    By passwordTxtBox = By.name("password");
    By loginBtn = By.xpath("//button[normalize-space()='Login']");

    public void login(String userName,String password){
        action.type(userNameTxtBox,userName);
        action.type(passwordTxtBox,password);
        action.click(loginBtn);
    }


}
