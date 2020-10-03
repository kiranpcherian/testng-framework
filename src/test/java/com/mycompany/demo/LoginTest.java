package com.mycompany.demo;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest { 
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite executed");

    }@AfterSuite
    public void afterSuite(){
        System.out.println("After suite executed");
    }
    @Parameters({"browser","os"})
    @BeforeTest
    public void beforeTest(String browser, String os){
        System.out.println("Before test executed");
        System.out.println("Browser : " + browser);
        System.out.println("OS : "+ os);

    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test executed");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class method executed");

    }@AfterClass
    public void afterClass(){
        System.out.println("After class method executed");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method executed");

    }@AfterMethod
    public void afterMethod(){
        System.out.println("After method executed");
    }

    @Test(priority = 1, testName = "Login with valid username and password",
            dataProvider = "userInfo",dataProviderClass = TestData.class)
    public void loginWithValidUser(String userName, String password){
        System.out.println("Login test with valid user and password");
        System.out.println("Username : " + userName);
        System.out.println("Password : " + password);
        String act = "Hello";
        String exp = "Hello";
        Assert.assertEquals(act,exp,"This words do not match");


    }@Test(priority = 2,testName = "Login with invalid username and password",dataProvider = "userInfo",dataProviderClass = TestData.class)
    public void loginWithoutValidUser(String username,String password){
        System.out.println("Login with invalid user and password");
        Assert.fail("Invalid user test failed");
        System.out.println("Username :" + username );
        System.out.println("Password :" + password);

    }@Test(priority = 3, testName = "Verify homepage title")
    public void homepageTest(){
        System.out.println("This is a homepage test");
        String act = "Homepage";
        String exp = "Homepage";
        Assert.assertTrue(act==exp,"Homepage title is incorrect");

    }@Test(priority = 4,testName = "Verify logout")
    public void logoutTest(){
        System.out.println("This is a logout test");
    }

}
