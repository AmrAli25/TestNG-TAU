package testngTAU;

import org.testng.annotations.*;

public class DemoAnnotations {
    @BeforeSuite
    void beforeSuite() {
        System.out.println("Chrome - Set Up System Property");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("Open chrome");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("Open Test Application");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Sign in ");
    }

    @Test
    void searchCustomer() {
        System.out.println("Search for Customer");
    }

    @Test
    void searchProduct() {
        System.out.println("Search for Product");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("Sign out");
    }

    @AfterClass
    void afterClass() {
        System.out.println("Close test Application");
    }

    @AfterTest
    void afterTest() {
        System.out.println("Close chrome");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("Chrome - Clean all cookies");
    }
}
