package com.orange;

import actions.Action;
import base.BaseClass;
import org.openqa.selenium.By;

public class HomePage extends BaseClass {
    Action action = new Action();
    By pimBtn = By.xpath("//*[normalize-space()='PIM']");
    public void navigaeToPimPage(){
        action.click(pimBtn);
    }
}
