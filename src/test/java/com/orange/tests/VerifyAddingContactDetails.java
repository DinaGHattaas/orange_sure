package com.orange.tests;

import base.BaseClass;
import com.orange.ContactDetailsPage;
import com.orange.HomePage;
import com.orange.LoginPage;
import com.orange.PimPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.JsonReaderCotactDetails;

import java.util.HashMap;

public class VerifyAddingContactDetails extends BaseClass {
    @BeforeTest
    public void setUp() {
        loadConfig();
        launchWeb();
    }

    @Test(dataProvider = "contactDetails", dataProviderClass = JsonReaderCotactDetails.class)
    public void verifyAdminCanAddContactDetails(HashMap<String, String> contactDetails) {
        LoginPage loginPageObj = new LoginPage();
        HomePage homePageObj = new HomePage();
        PimPage pimPageObj = new PimPage();
        ContactDetailsPage contactDetails1obj = new ContactDetailsPage();

        loginPageObj.login("Admin", "admin123");
        homePageObj.navigaeToPimPage();
        pimPageObj.searchByEmployeeName("Alice");
        pimPageObj.clickOnEditIcon();
        pimPageObj.clickOnContactDetails();
        contactDetails1obj.FillContactdetails(
                contactDetails.get("city"),
                contactDetails.get("state"),
                contactDetails.get("zip")
        );

    }
}
