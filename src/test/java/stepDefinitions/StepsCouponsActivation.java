package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageObjects.CouponsPage;
import pageObjects.HomePage;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static testRunner.BaseClass.checkIfServerIsRunning;

public class StepsCouponsActivation {

    HomePage homePage;
    CouponsPage couponsPage;
    public static final int COUPONS_POSITION = 8;
    public static AppiumDriverLocalService service;

    public static AndroidDriver driver;
    @Before
    public static void Device_Setup() throws MalformedURLException {
        boolean flag = checkIfServerIsRunning(4723);
        if (!flag) {
            service = AppiumDriverLocalService.buildDefaultService();
            service.start();
        }
        DesiredCapabilities android_CAPS = new DesiredCapabilities();
        android_CAPS.setCapability(MobileCapabilityType.DEVICE_NAME, "Spull_Redmi7");
        android_CAPS.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        android_CAPS.setCapability(MobileCapabilityType.UDID, "4acb68c8");
        android_CAPS.setCapability("appPackage", "com.adobe.cq.mobile.payback");
        android_CAPS.setCapability("appActivity","com.valtech.payback.presentation.ui.activities.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, android_CAPS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("User login into Payback application")
    public void User_login_into_Payback_application() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.homePageTitle.isDisplayed();
        homePage.myAccountButton.click();
        homePage.signInButton.click();
        Thread.sleep(30000);
    }

    @When("User selects Coupons from menu items")
    public void user_selects_coupons_from_menu_items() {
        homePage.sideMenuButton.click();
        homePage.menuListItems.get(COUPONS_POSITION).click();
    }

    @And("Coupons view is displayed")
    public void coupons_view_is_displayed() {
        couponsPage = new CouponsPage(driver);
        if(couponsPage.couponsHelpDialogSkipButton.isDisplayed()) {
            couponsPage.couponsHelpDialogSkipButton.click();
        }
        couponsPage.couponsPageTitle.isDisplayed();

    }

    @Then("User activates if any coupon is available")
    public void User_activates_if_any_coupon_is_available() {
        if(couponsPage.noCoupounsToActivateNote.isDisplayed()) {
            System.out.println("Sorry. No Coupons available to Activate");
        }

    }

    @After
    public static void Android_Teardown() {
        driver.quit();
    }
}
